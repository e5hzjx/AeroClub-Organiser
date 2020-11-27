package hu.elte.AeroClubOrganiser.service.impl;

import hu.elte.AeroClubOrganiser.model.Plane;
import hu.elte.AeroClubOrganiser.repository.PlaneRepository;
import hu.elte.AeroClubOrganiser.service.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


@Service
@Transactional
public class PlaneServiceImpl implements PlaneService {
    @Autowired
    private PlaneRepository planeRepository;

    @Override
    public Plane findById(Long id) {
        Plane plane = new Plane();
        Optional<Plane> optionalPlane = planeRepository.findById(id);
        if(optionalPlane.isPresent())
        {
            plane = optionalPlane.get();
        }
        return plane;
    }

    @Override
    public void save(Plane plane) {
        planeRepository.save(plane);
    }

    @Override
    public void delete(Plane plane) {
        planeRepository.delete(plane);
    }

    @Override
    public List<Plane> listPlanes() {
        return planeRepository.findAll();
    }
}
