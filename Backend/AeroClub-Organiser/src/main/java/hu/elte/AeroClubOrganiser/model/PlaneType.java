package hu.elte.AeroClubOrganiser.model;

import javax.persistence.*;
import java.util.List;
import java.util.Optional;

@Entity
public class PlaneType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @Column(name = "type", nullable = false)
    String type;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "endorsement_fk")
    Endorsement endorsement;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "plane_fk")
    private List<Plane> planes;

    public PlaneType() {
    }

    public PlaneType(long id, String type, Endorsement endorsement, List<Plane> planes) {
        this.id = id;
        this.type = type;
        this.endorsement = endorsement;
        this.planes = planes;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Endorsement getEndorsement() {
        return endorsement;
    }

    public void setEndorsement(Endorsement endorsement) {
        this.endorsement = endorsement;
    }

    public List<Plane> getPlanes() {
        return planes;
    }

    public void setPlanes(List<Plane> planes) {
        this.planes = planes;
    }

    @Override
    public String toString() {
        return "PlaneType{" +
                "type='" + type + '\'' +
                ", endorsement=" + endorsement +
                ", planes=" + planes +
                '}';
    }
}
