package hu.elte.AeroClubOrganiser.repository;

import hu.elte.AeroClubOrganiser.model.Licenses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LicensesRepository extends JpaRepository<Licenses, Long> {
    @Override
    Optional<Licenses> findById(Long aLong);
}
