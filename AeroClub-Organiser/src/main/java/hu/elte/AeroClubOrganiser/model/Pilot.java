package hu.elte.AeroClubOrganiser.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;


@Entity
public class Pilot {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private List<Endorsement> endorsements;
    @ManyToOne(fetch = FetchType.LAZY)
    Transporter transporter;

    String name;
    String email;
    String password;
    String rememberToken;
    String number;
    Date dateOfBirth;
    Date startOfClubMembership;
}
