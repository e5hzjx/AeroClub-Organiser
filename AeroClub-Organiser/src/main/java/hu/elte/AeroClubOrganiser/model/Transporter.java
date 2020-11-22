package hu.elte.AeroClubOrganiser.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;


@Entity
public class Transporter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long ID;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long planeID;
    String transporterType;
    String licensePlaneNumber;
    Date technicalSuitabilityValid;
    Date insuranceValidUntil;
    long responsiblePerson;

}
