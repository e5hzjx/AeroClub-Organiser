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
    private List<License> licens;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Endorsement> endorsements;
    @ManyToOne(fetch = FetchType.LAZY)
    private Transporter transporter;

    private String name;
    private String email;
    private String password;
    private String rememberToken;
    private String number;
    private Date dateOfBirth;
    private Date startOfClubMembership;
}
