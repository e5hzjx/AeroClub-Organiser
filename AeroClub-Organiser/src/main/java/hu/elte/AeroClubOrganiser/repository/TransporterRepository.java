package hu.elte.AeroClubOrganiser.repository;

import hu.elte.AeroClubOrganiser.model.Transporter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TransporterRepository extends JpaRepository<Transporter, Long> {
    @Override
    Optional<Transporter> findById(Long aLong);
}
