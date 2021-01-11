import { Pilot } from "./pilot.model";
import { Planetype } from "./planetype.model";

export class Parachute{

    serialNumber: String;
    type: String;
    responsiblePerson: Pilot;
    foldingDate: Date;
    lifeTimeValidity: Date;
    id? : Number;
    constructor( 
        serialnumber: String,
        type:String,
        responsiblePerson:Pilot,
        foldingDate: Date,
        lifetimeValidty: Date,
        id? : Number
            
    ){
        this.serialNumber=serialnumber;
        this.type=type;
        this.responsiblePerson=responsiblePerson;
        this.lifeTimeValidity=lifetimeValidty;
        this.foldingDate=foldingDate;
        this.id=id;
        
    }
}