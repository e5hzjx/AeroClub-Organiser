package hu.elte.AeroClubOrganiser.model;

import javax.persistence.*;
import java.util.List;
import java.util.Optional;

@Entity
public class PlaneType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "type", nullable = false)
    String type;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "endorsement_fk")
    Endorsement endorsement;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "plane_fk")
    private List<Plane> planes;

}
