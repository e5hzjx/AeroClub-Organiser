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

    private String name;
    private String email;
    private String password;
    private String rememberToken;
    private String phoneNumber;
    private Date dateOfBirth;
    private Date startOfClubMembership;
}
