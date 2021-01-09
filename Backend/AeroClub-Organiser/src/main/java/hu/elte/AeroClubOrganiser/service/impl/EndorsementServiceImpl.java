package hu.elte.AeroClubOrganiser.service.impl;

import hu.elte.AeroClubOrganiser.model.Endorsement;
import hu.elte.AeroClubOrganiser.repository.EndorsementRepository;
import hu.elte.AeroClubOrganiser.service.EndorsementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class EndorsementServiceImpl implements EndorsementService {
    @Autowired
    private EndorsementRepository endorsementRepository;

    @Override
    public Endorsement findById(Long id) {
        Endorsement endorsement = new Endorsement();
        Optional<Endorsement> optionalEndorsement = endorsementRepository.findById(id);
        if(optionalEndorsement.isPresent())
        {
            endorsement = optionalEndorsement.get();
        }
        return endorsement;
    }

    @Override
    public void save(Endorsement endorsement) {
        endorsementRepository.save(endorsement);
    }

    @Override
    public void delete(Endorsement endorsement) {
        endorsementRepository.delete(endorsement);
    }
}
