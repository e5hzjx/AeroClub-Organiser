package hu.elte.AeroClubOrganiser.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;


@Entity
public class Transporter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Plane> planes;

    @ManyToOne(fetch = FetchType.LAZY)
    Pilot responsiblePerson;

    String transporterType;
    String licensePlateNumber;
    Date insuranceValidUntil;

    public Transporter() {
    }

    public Transporter(long id, List<Plane> planes, Pilot responsiblePerson, String transporterType,
                       String licensePlateNumber, Date insuranceValidUntil) {
        this.id = id;
        this.planes = planes;
        this.responsiblePerson = responsiblePerson;
        this.transporterType = transporterType;
        this.licensePlateNumber = licensePlateNumber;
        this.insuranceValidUntil = insuranceValidUntil;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Plane> getPlanes() {
        return planes;
    }

    public void setPlanes(List<Plane> planes) {
        this.planes = planes;
    }

    public Pilot getResponsiblePerson() {
        return responsiblePerson;
    }

    public void setResponsiblePerson(Pilot responsiblePerson) {
        this.responsiblePerson = responsiblePerson;
    }

    public String getTransporterType() {
        return transporterType;
    }

    public void setTransporterType(String transporterType) {
        this.transporterType = transporterType;
    }

    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }

    public Date getInsuranceValidUntil() {
        return insuranceValidUntil;
    }

    public void setInsuranceValidUntil(Date insuranceValidUntil) {
        this.insuranceValidUntil = insuranceValidUntil;
    }

    @Override
    public String toString() {
        return "Transporter{" +
                "planes=" + planes +
                ", responsiblePerson=" + responsiblePerson +
                ", transporterType='" + transporterType + '\'' +
                ", licensePlateNumber='" + licensePlateNumber + '\'' +
                ", insuranceValidUntil=" + insuranceValidUntil +
                '}';
    }
}
