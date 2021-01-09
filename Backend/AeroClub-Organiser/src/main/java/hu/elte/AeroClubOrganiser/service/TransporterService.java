package hu.elte.AeroClubOrganiser.service;

import hu.elte.AeroClubOrganiser.model.Transporter;

import java.util.List;

public interface TransporterService {
    public Transporter findById(Long id);
    public void save(Transporter transporter);
    public void delete(Transporter transporter);

}
