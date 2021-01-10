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
    private String licenseNumber;
    private Date dateOfInitialIssue;

    public License() {
    }

    public License(long id, Pilot pilotId, String licenseNumber, Date dateOfInitialIssue) {
        this.id = id;
        this.pilotId = pilotId;
        this.licenseNumber = licenseNumber;
        this.dateOfInitialIssue = dateOfInitialIssue;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Pilot getPilotId() {
        return pilotId;
    }

    public void setPilotId(Pilot pilotId) {
        this.pilotId = pilotId;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public Date getDateOfInitialIssue() {
        return dateOfInitialIssue;
    }

    public void setDateOfInitialIssue(Date dateOfInitialIssue) {
        this.dateOfInitialIssue = dateOfInitialIssue;
    }

    @Override
    public String toString() {
        return "License{" +
                "pilotId=" + pilotId +
                ", licenseNumber='" + licenseNumber + '\'' +
                ", dateOfInitialIssue=" + dateOfInitialIssue +
                '}';
    }
}
