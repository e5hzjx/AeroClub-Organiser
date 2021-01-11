package hu.elte.AeroClubOrganiser.service;

import hu.elte.AeroClubOrganiser.model.Parachute;
import hu.elte.AeroClubOrganiser.model.Pilot;

import java.util.List;

public interface ParachuteService {
    public List<Parachute> findAll();
    public Parachute findById(Long id);
    public void save(Parachute parachute);
    public void delete(Parachute parachute);
}
