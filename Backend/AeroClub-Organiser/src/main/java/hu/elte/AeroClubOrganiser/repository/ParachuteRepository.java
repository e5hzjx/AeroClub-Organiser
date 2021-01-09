package hu.elte.AeroClubOrganiser.repository;

import hu.elte.AeroClubOrganiser.model.License;
import hu.elte.AeroClubOrganiser.model.Parachute;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ParachuteRepository extends JpaRepository<Parachute, Long> {
    @Override
    Optional<Parachute> findById(Long aLong);
}
