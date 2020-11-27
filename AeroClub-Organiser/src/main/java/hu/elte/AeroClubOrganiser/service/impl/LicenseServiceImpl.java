package hu.elte.AeroClubOrganiser.service.impl;


import hu.elte.AeroClubOrganiser.model.License;
import hu.elte.AeroClubOrganiser.repository.LicenseRepository;
import hu.elte.AeroClubOrganiser.service.LicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class LicenseServiceImpl implements LicenseService {
    @Autowired
    private LicenseRepository licenseRepository;

    @Override
    public License findById(Long id) {
        License license = new License();
        Optional<License> optionalLicense = licenseRepository.findById(id);
        if(optionalLicense.isPresent())
        {
            license = optionalLicense.get();
        }
        return license;
    }

    @Override
    public void save(License license) {
        licenseRepository.save(license);
    }

    @Override
    public void delete(License license) {
        licenseRepository.delete(license);
    }
}
