package hu.elte.AeroClubOrganiser.service;

import hu.elte.AeroClubOrganiser.model.Plane;

import java.util.List;

public interface PlaneService {
    public Plane findById(Long id);
    public void save(Plane plane);
    public void delete(Plane plane);
    public List<Plane> listPlanes();
}
