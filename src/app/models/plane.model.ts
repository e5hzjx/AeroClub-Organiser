import { Pilot } from "./pilot.model";
import { Planetype } from "./planetype.model";

export class Plane{
    tailnumber: String;
    regnumber: String;
    planetype: Planetype;    //? Type
    responsibleperson: Pilot;
    airworthinessValidUntil: Date;
    insuranceValidUntil: Date;
    yearlyMaintenance: Date;


    id? : number;
    constructor( 
        tailnumber: String,
        regnumber:String,
        planetype:Planetype,    //? Type
        responsibleperson: Pilot,
        airworthinessValidUntil: Date,
        insuranceValidUntil: Date,
        yearlyMaintenance: Date,
        id? : number    
    ){
        this.tailnumber=tailnumber;
        this.regnumber=regnumber;
        this.planetype=planetype;
        this.responsibleperson=responsibleperson;
        this.airworthinessValidUntil=airworthinessValidUntil;
        this.insuranceValidUntil=insuranceValidUntil;
        this.yearlyMaintenance=yearlyMaintenance;
        this.id=id;
        
    }
}