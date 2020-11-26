package hu.elte.AeroClubOrganiser.model;

import org.hibernate.engine.profile.Fetch;

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
    Date insuranceValidUtil;
    Date yearlyMaintenance;
}
