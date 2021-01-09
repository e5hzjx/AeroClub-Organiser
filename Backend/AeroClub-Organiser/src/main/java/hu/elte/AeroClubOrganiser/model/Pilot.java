package hu.elte.AeroClubOrganiser.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;


@Entity
public class Pilot {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToMany(fetch = FetchType.LAZY)
    private List<License> licenses;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Parachute> parachutes;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Plane> responsibleForPlanes;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Endorsement> endorsements;
    @OneToMany(fetch = FetchType.LAZY)
    private List<Transporter> transporters;

    private String pilotName;
    private String pilotEmail;
    private String password;
    private String rememberToken;
    private String phoneNumber;
    private Date dateOfBirth;
    private Date startOfClubMembership;


    public Pilot() {
    }

    public Pilot(String name, String email, String password) {
        this.pilotName = name;
        this.pilotEmail = email;
        this.password = password;
    }
    public long getId() {
        return id;
    }

    public String getEmail() {
        return pilotEmail;
    }
    public String getPassword(){
        return this.password;
    }

    public String getName(){
        return this.pilotName;
    }
}
