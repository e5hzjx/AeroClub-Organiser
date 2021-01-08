import { Pilot } from "./pilot.model";
import { Plane } from "./plane.model";

export class Transporter{

    responsiblePerson: Pilot;
    insuranceValidUntil:Date;
    licesePlateNumber:String;
    transporterType:String;
    planes:Plane[];
    id?:number;
    constructor(
        responsiblePerson: Pilot,
        insuranceValidUntil:Date,
        licesePlateNumber:String,
        transporterType:String,
        planes:Plane[],
        id?:number,
    ){
        this.responsiblePerson=responsiblePerson;
        this.insuranceValidUntil=insuranceValidUntil;
        this.licesePlateNumber=licesePlateNumber;
        this.transporterType=transporterType;
        this.planes=planes;
    }


}