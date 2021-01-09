package hu.elte.AeroClubOrganiser.repository;

import hu.elte.AeroClubOrganiser.model.PlaneType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlaneTypeRepository extends JpaRepository<PlaneType,Long> {
    @Override
    Optional<PlaneType> findById(Long aLong);
}
