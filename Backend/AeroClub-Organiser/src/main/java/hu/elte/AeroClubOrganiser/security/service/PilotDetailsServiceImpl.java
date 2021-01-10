package hu.elte.AeroClubOrganiser.security.service;

import hu.elte.AeroClubOrganiser.model.Pilot;
import hu.elte.AeroClubOrganiser.repository.PilotRepository;
import hu.elte.AeroClubOrganiser.security.service.PilotDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class PilotDetailsServiceImpl implements UserDetailsService{
    @Autowired
    PilotRepository pilotRepository;


    @Override
    @Transactional
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        //if (s.equals(null)) System.out.println("ripme S is null");
        Optional<Pilot> pilot = pilotRepository.findByPilotName(s);
        if(!pilot.isPresent())
        {
           throw new UsernameNotFoundException("Username was not found");
        }
        return PilotDetailsImpl.build(pilot.get());
    }

    @Transactional
    public void deleteByPilotName(String s) throws UsernameNotFoundException {
        Optional<Pilot> pilot = pilotRepository.findByPilotName(s);
        if(!pilot.isPresent()) {
            throw new UsernameNotFoundException("Username was not found");
        }
        pilotRepository.delete(pilot.get());
    }

}
