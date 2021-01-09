package hu.elte.AeroClubOrganiser.service.impl;

import hu.elte.AeroClubOrganiser.model.Pilot;
import hu.elte.AeroClubOrganiser.model.Plane;
import hu.elte.AeroClubOrganiser.repository.PilotRepository;
import hu.elte.AeroClubOrganiser.service.PilotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class PilotServiceImpl implements PilotService {
    @Autowired
    private PilotRepository pilotRepository;

    @Override
    public Pilot findById(Long id) {
        Pilot pilot = new Pilot();
        Optional<Pilot> optionalPilot = pilotRepository.findById(id);
        if(optionalPilot.isPresent())
        {
            pilot = optionalPilot.get();
        }
        return pilot;
    }

    @Override
    public void save(Pilot pilot) {
        pilotRepository.save(pilot);
    }

    @Override
    public void delete(Pilot pilot) {
        pilotRepository.delete(pilot);
    }

    @Override
    public Pilot findByPilotName(String name) {
        Pilot pilot = new Pilot();
        Optional<Pilot> optionalPilot = pilotRepository.findByPilotName(name);
        if(optionalPilot.isPresent())
        {
            pilot = optionalPilot.get();
        }
        return pilot;
    }
    @Override
    public Pilot findByPilotEmail(String email) {
        Pilot pilot = new Pilot();
        Optional<Pilot> optionalPilot = pilotRepository.findByPilotEmail(email);
        if(optionalPilot.isPresent())
        {
            pilot = optionalPilot.get();
        }
        return pilot;
    }

    @Override
    public boolean existsByPilotName(String name) {
        Optional<Pilot> optionalPilot = pilotRepository.findByPilotName(name);
        if(optionalPilot.isPresent())
        {
            return true;
        }
        return false;
    }

    @Override
    public boolean existsByPilotEmail(String email) {
        Optional<Pilot> optionalPilot = pilotRepository.findByPilotEmail(email);
        if(optionalPilot.isPresent())
        {
            return true;
        }
        return false;
    }

}
