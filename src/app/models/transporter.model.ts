import { Pilot } from "./pilot.model";
import { Plane } from "./plane.model";

export class Transporter{

    responsiblePerson: Pilot;
    insuranceValidUntil:Date;
    technicalSuitabilityValid:Date;
    licesePlateNumber:String;
    transporterType:String;
    plane:Plane;
    id?:number;
    constructor(
        responsiblePerson: Pilot,
        insuranceValidUntil:Date,
        technicalSuitabilityValid:Date,
        licesePlateNumber:String,
        transporterType:String,
        plane:Plane,
        id?:number,
    ){
        this.responsiblePerson=responsiblePerson;
        this.insuranceValidUntil=insuranceValidUntil;
        this.technicalSuitabilityValid=technicalSuitabilityValid;
        this.licesePlateNumber=licesePlateNumber;
        this.transporterType=transporterType;
        this.plane=plane;
    }


}