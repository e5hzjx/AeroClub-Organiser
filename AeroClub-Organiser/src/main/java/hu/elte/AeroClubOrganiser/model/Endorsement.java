package hu.elte.AeroClubOrganiser.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Endorsement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long ID;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long pilotID;
    long type;
    Date planeTypeDate;
}
