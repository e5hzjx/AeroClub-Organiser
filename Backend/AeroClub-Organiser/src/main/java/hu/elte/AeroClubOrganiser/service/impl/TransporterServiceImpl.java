package hu.elte.AeroClubOrganiser.service.impl;


import hu.elte.AeroClubOrganiser.model.Plane;
import hu.elte.AeroClubOrganiser.model.Transporter;
import hu.elte.AeroClubOrganiser.repository.TransporterRepository;
import hu.elte.AeroClubOrganiser.service.TransporterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class TransporterServiceImpl implements TransporterService {
    @Autowired
    private TransporterRepository transporterRepository;

    @Override
    public Transporter findById(Long id) {
        Transporter transporter = new Transporter();
        Optional<Transporter> optionalTransporter = transporterRepository.findById(id);
        if(optionalTransporter.isPresent())
        {
            transporter = optionalTransporter.get();
        }
        return transporter;
    }

    @Override
    public void save(Transporter transporter) {
        transporterRepository.save(transporter);
    }

    @Override
    public void delete(Transporter transporter) {
        transporterRepository.delete(transporter);
    }
}
