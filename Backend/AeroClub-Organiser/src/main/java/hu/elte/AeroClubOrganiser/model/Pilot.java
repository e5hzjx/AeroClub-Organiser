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

    public Pilot(){
    }

    public Pilot(String name, String email, String password) {
        this.pilotName = name;
        this.pilotEmail = email;
        this.password = password;
    }

    public Pilot(long id, List<License> licenses, List<Parachute> parachutes,
                 List<Plane> responsibleForPlanes, List<Endorsement> endorsements,
                 List<Transporter> transporters, String pilotName, String pilotEmail,
                 String password, String rememberToken, String phoneNumber, Date dateOfBirth,
                 Date startOfClubMembership) {
        this.id = id;
        this.licenses = licenses;
        this.parachutes = parachutes;
        this.responsibleForPlanes = responsibleForPlanes;
        this.endorsements = endorsements;
        this.transporters = transporters;
        this.pilotName = pilotName;
        this.pilotEmail = pilotEmail;
        this.password = password;
        this.rememberToken = rememberToken;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.startOfClubMembership = startOfClubMembership;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<License> getLicenses() {
        return licenses;
    }

    public void setLicenses(List<License> licenses) {
        this.licenses = licenses;
    }

    public List<Parachute> getParachutes() {
        return parachutes;
    }

    public void setParachutes(List<Parachute> parachutes) {
        this.parachutes = parachutes;
    }

    public List<Plane> getResponsibleForPlanes() {
        return responsibleForPlanes;
    }

    public void setResponsibleForPlanes(List<Plane> responsibleForPlanes) {
        this.responsibleForPlanes = responsibleForPlanes;
    }

    public List<Endorsement> getEndorsements() {
        return endorsements;
    }

    public void setEndorsements(List<Endorsement> endorsements) {
        this.endorsements = endorsements;
    }

    public List<Transporter> getTransporters() {
        return transporters;
    }

    public void setTransporters(List<Transporter> transporters) {
        this.transporters = transporters;
    }

    public String getPilotName() {
        return pilotName;
    }

    public void setPilotName(String pilotName) {
        this.pilotName = pilotName;
    }

    public String getPilotEmail() {
        return pilotEmail;
    }

    public void setPilotEmail(String pilotEmail) {
        this.pilotEmail = pilotEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRememberToken() {
        return rememberToken;
    }

    public void setRememberToken(String rememberToken) {
        this.rememberToken = rememberToken;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getStartOfClubMembership() {
        return startOfClubMembership;
    }

    public void setStartOfClubMembership(Date startOfClubMembership) {
        this.startOfClubMembership = startOfClubMembership;
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "licenses=" + licenses +
                ", parachutes=" + parachutes +
                ", responsibleForPlanes=" + responsibleForPlanes +
                ", endorsements=" + endorsements +
                ", transporters=" + transporters +
                ", pilotName='" + pilotName + '\'' +
                ", pilotEmail='" + pilotEmail + '\'' +
                ", password='" + password + '\'' +
                ", rememberToken='" + rememberToken + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", startOfClubMembership=" + startOfClubMembership +
                '}';
    }
}
