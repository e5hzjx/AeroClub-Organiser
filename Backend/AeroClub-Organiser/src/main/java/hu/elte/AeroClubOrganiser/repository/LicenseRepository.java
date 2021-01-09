package hu.elte.AeroClubOrganiser.repository;

import hu.elte.AeroClubOrganiser.model.License;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LicenseRepository extends JpaRepository<License, Long> {
    @Override
    Optional<License> findById(Long aLong);
}
