package hu.elte.AeroClubOrganiser.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Parachute {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Pilot responsiblePerson;

    private String type;
    private String serialNumber;
    private String lifeTimeValidity;
    private LocalDate foldingDate;

}
