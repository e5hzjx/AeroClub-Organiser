package hu.elte.AeroClubOrganiser.service;

import hu.elte.AeroClubOrganiser.model.Parachute;
import hu.elte.AeroClubOrganiser.model.Pilot;

public interface ParachuteService {
    public Parachute findById(Long id);
    public void save(Parachute parachute);
    public void delete(Parachute parachute);
}
