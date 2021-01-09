package hu.elte.AeroClubOrganiser.repository;

import hu.elte.AeroClubOrganiser.model.Plane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlaneRepository extends JpaRepository<Plane,Long > {
    @Override
    Optional<Plane> findById(Long aLong);
}
