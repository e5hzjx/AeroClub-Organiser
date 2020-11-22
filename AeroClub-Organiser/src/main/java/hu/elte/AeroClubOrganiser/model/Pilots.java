package hu.elte.AeroClubOrganiser.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;


@Entity
public class Pilots {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long ID;
    String name;
    String email;
    String password;
    String rememberToken;
    String number;
    Date dateOfBirth;
    Date startOfClubMembership;
}
