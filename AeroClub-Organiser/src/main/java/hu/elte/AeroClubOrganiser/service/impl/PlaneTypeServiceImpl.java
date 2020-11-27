package hu.elte.AeroClubOrganiser.service.impl;

import hu.elte.AeroClubOrganiser.model.Plane;
import hu.elte.AeroClubOrganiser.model.PlaneType;
import hu.elte.AeroClubOrganiser.repository.PlaneTypeRepository;
import hu.elte.AeroClubOrganiser.service.PlaneTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PlaneTypeServiceImpl implements PlaneTypeService {
    @Autowired
    private PlaneTypeRepository planeTypeRepository;

    @Override
    public PlaneType findById(Long id) {
        PlaneType planeType = new PlaneType();
        Optional<PlaneType> optionalPlaneType = planeTypeRepository.findById(id);
        if(optionalPlaneType.isPresent())
        {
            planeType = optionalPlaneType.get();
        }
        return planeType;
    }

    @Override
    public void save(PlaneType planeType) {
        planeTypeRepository.save(planeType);
    }

    @Override
    public void delete(PlaneType planeType) {
        planeTypeRepository.delete(planeType);
    }
}
