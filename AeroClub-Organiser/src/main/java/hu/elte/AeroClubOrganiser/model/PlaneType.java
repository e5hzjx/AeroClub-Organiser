package hu.elte.AeroClubOrganiser.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PlaneType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long ID;
    String type;

}
