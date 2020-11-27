package hu.elte.AeroClubOrganiser.service;

import hu.elte.AeroClubOrganiser.model.License;

public interface LicenseService {
    public License findById(Long id);
    public void save(License license);
    public void delete(License license);
}
