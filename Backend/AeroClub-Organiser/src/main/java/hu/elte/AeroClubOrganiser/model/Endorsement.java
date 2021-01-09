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
    private Pilot pilotId;

    @OneToOne(fetch = FetchType.LAZY)
    private PlaneType type;




    Date planeTypeDate;
}
