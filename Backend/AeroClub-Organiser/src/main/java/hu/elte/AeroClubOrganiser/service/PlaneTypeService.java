package hu.elte.AeroClubOrganiser.service;

import hu.elte.AeroClubOrganiser.model.PlaneType;

public interface PlaneTypeService {
    public PlaneType findById(Long id);
    public void save(PlaneType planeType);
    public void delete(PlaneType planeType);
}
