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

    public Parachute() {
    }

    public Parachute(long id, Pilot responsiblePerson, String type, String serialNumber,
                     String lifeTimeValidity, LocalDate foldingDate) {
        this.id = id;
        this.responsiblePerson = responsiblePerson;
        this.type = type;
        this.serialNumber = serialNumber;
        this.lifeTimeValidity = lifeTimeValidity;
        this.foldingDate = foldingDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Pilot getResponsiblePerson() {
        return responsiblePerson;
    }

    public void setResponsiblePerson(Pilot responsiblePerson) {
        this.responsiblePerson = responsiblePerson;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getLifeTimeValidity() {
        return lifeTimeValidity;
    }

    public void setLifeTimeValidity(String lifeTimeValidity) {
        this.lifeTimeValidity = lifeTimeValidity;
    }

    public LocalDate getFoldingDate() {
        return foldingDate;
    }

    public void setFoldingDate(LocalDate foldingDate) {
        this.foldingDate = foldingDate;
    }

    @Override
    public String toString() {
        return "Parachute{" +
                "responsiblePerson=" + responsiblePerson +
                ", type='" + type + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", lifeTimeValidity='" + lifeTimeValidity + '\'' +
                ", foldingDate=" + foldingDate +
                '}';
    }
}
