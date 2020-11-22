package hu.elte.AeroClubOrganiser.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Planes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long ID;
    long type;
    String regNumber;
    String tailNumber;
    long responsiblePerson;
    Date airworthinessValidUntil;
    Date insuranceValidUtil;
    Date yearlyMaintenance;
}
