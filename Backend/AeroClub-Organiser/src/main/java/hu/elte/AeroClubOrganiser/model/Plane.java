package hu.elte.AeroClubOrganiser.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Plane {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    @ManyToOne(fetch = FetchType.LAZY)
    PlaneType type;
    String regNumber;
    String tailNumber;
    @ManyToOne(fetch = FetchType.LAZY)
    Pilot responsiblePerson;
    Date airworthinessValidUntil;
    Date insuranceValidUntil;
    Date yearlyMaintenance;


    public Plane() {
    }

    public Plane(long id, PlaneType type, String regNumber, String tailNumber, Pilot responsiblePerson, Date airworthinessValidUntil, Date insuranceValidUntil, Date yearlyMaintenance) {
        this.id = id;
        this.type = type;
        this.regNumber = regNumber;
        this.tailNumber = tailNumber;
        this.responsiblePerson = responsiblePerson;
        this.airworthinessValidUntil = airworthinessValidUntil;
        this.insuranceValidUntil = insuranceValidUntil;
        this.yearlyMaintenance = yearlyMaintenance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public PlaneType getType() {
        return type;
    }

    public void setType(PlaneType type) {
        this.type = type;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getTailNumber() {
        return tailNumber;
    }

    public void setTailNumber(String tailNumber) {
        this.tailNumber = tailNumber;
    }

    public Pilot getResponsiblePerson() {
        return responsiblePerson;
    }

    public void setResponsiblePerson(Pilot responsiblePerson) {
        this.responsiblePerson = responsiblePerson;
    }

    public Date getAirworthinessValidUntil() {
        return airworthinessValidUntil;
    }

    public void setAirworthinessValidUntil(Date airworthinessValidUntil) {
        this.airworthinessValidUntil = airworthinessValidUntil;
    }

    public Date getInsuranceValidUntil() {
        return insuranceValidUntil;
    }

    public void setInsuranceValidUntil(Date insuranceValidUntil) {
        this.insuranceValidUntil = insuranceValidUntil;
    }

    public Date getYearlyMaintenance() {
        return yearlyMaintenance;
    }

    public void setYearlyMaintenance(Date yearlyMaintenance) {
        this.yearlyMaintenance = yearlyMaintenance;
    }

    @Override
    public String toString() {
        return "Plane{" +
                ", type=" + type +
                ", regNumber='" + regNumber + '\'' +
                ", tailNumber='" + tailNumber + '\'' +
                ", responsiblePerson=" + responsiblePerson +
                ", airworthinessValidUntil=" + airworthinessValidUntil +
                ", insuranceValidUntil=" + insuranceValidUntil +
                ", yearlyMaintenance=" + yearlyMaintenance +
                '}';
    }
}
