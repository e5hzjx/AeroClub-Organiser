package hu.elte.AeroClubOrganiser.repository;

import hu.elte.AeroClubOrganiser.model.Pilot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PilotRepository extends JpaRepository<Pilot, Long> {
    @Override
    Optional<Pilot> findById(Long aLong);
}
