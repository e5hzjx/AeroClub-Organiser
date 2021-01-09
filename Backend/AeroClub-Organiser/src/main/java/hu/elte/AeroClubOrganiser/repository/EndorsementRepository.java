package hu.elte.AeroClubOrganiser.repository;

import hu.elte.AeroClubOrganiser.model.Endorsement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface EndorsementRepository extends JpaRepository<Endorsement, Long> {
    @Override
    Optional<Endorsement> findById(Long aLong);
}
