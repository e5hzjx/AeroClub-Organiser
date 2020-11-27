package hu.elte.AeroClubOrganiser.service;

import hu.elte.AeroClubOrganiser.model.Endorsement;

public interface EndorsementService {
    public Endorsement findById(Long id);
    public void save(Endorsement endorsement);
    public void delete(Endorsement endorsement);

}
