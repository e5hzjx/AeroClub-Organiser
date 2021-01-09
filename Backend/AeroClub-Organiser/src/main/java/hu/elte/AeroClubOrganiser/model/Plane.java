package hu.elte.AeroClubOrganiser.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Plane {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @ManyToOne(fetch = FetchType.LAZY)
    PlaneType type;

    String regNumber;
    String tailNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    Pilot responsiblePerson;

    Date airworthinessValidUntil;
    Date insuranceValidUntil;
    Date yearlyMaintenance;
}
