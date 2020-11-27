package hu.elte.AeroClubOrganiser.service;

import hu.elte.AeroClubOrganiser.model.Pilot;

import java.util.List;

public interface PilotService {
    public Pilot findById(Long id);
    public void save(Pilot pilot);
    public void delete(Pilot pilot);
}
