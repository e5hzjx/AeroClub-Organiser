package hu.elte.AeroClubOrganiser.model;

import javax.persistence.*;
import java.sql.Date;


@Entity
public class Transporter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @ManyToOne(fetch = FetchType.LAZY)
    Plane planeId;

    String transporterType;
    String licensePlaneNumber;
    Date technicalSuitabilityValid;
    Date insuranceValidUntil;

    @ManyToOne(fetch = FetchType.LAZY)
    Pilot responsiblePerson;

}
