package hu.elte.AeroClubOrganiser.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;


@Entity
public class Transporter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Plane> planes;

    @ManyToOne(fetch = FetchType.LAZY)
    Pilot responsiblePerson;

    String transporterType;
    String licensePlateNumber;
    Date insuranceValidUntil;


}
