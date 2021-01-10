package hu.elte.AeroClubOrganiser.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
public class Endorsement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    @ManyToOne (fetch = FetchType.LAZY)
    private Pilot pilot;

    @OneToOne(fetch = FetchType.LAZY)
    private PlaneType type;

    Date planeTypeDate;

    public Endorsement() {
    }

    public Endorsement(long id, Pilot pilot, PlaneType type, Date planeTypeDate) {
        Id = id;
        this.pilot = pilot;
        this.type = type;
        this.planeTypeDate = planeTypeDate;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public PlaneType getType() {
        return type;
    }

    public void setType(PlaneType type) {
        this.type = type;
    }

    public Date getPlaneTypeDate() {
        return planeTypeDate;
    }

    public void setPlaneTypeDate(Date planeTypeDate) {
        this.planeTypeDate = planeTypeDate;
    }

    @Override
    public String toString() {
        return "Endorsement{" +
                "pilot=" + pilot +
                ", type=" + type +
                ", planeTypeDate=" + planeTypeDate +
                '}';
    }
}
