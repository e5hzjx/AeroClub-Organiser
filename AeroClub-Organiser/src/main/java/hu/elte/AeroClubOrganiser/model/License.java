package hu.elte.AeroClubOrganiser.model;


import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;


@Entity
public class License {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Pilot pilotId;
    private String number;
    private String title;
    private Date dateOfInitialIssue;

}
