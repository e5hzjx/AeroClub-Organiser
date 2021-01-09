package hu.elte.AeroClubOrganiser.service.impl;

import hu.elte.AeroClubOrganiser.model.License;
import hu.elte.AeroClubOrganiser.model.Parachute;
import hu.elte.AeroClubOrganiser.repository.ParachuteRepository;
import hu.elte.AeroClubOrganiser.service.ParachuteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class ParachuteServiceImpl implements ParachuteService {

    @Autowired
    ParachuteRepository parachuteRepository;

    @Override
    public Parachute findById(Long id) {
        Parachute parachute = new Parachute();
        Optional<Parachute> optionalParachute = parachuteRepository.findById(id);
        if(optionalParachute.isPresent())
        {
            parachute = optionalParachute.get();
        }
        return parachute;
    }

    @Override
    public void save(Parachute parachute) {
        parachuteRepository.save(parachute);
    }

    @Override
    public void delete(Parachute parachute) {
        parachuteRepository.delete(parachute);
    }
}
