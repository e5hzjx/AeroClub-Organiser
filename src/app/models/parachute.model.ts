import { Pilot } from "./pilot.model";
import { Planetype } from "./planetype.model";

export class Parachute{

    serialnumber: String;
    type: String;
    responsiblePerson: Pilot;
    foldingDate: Date;
    lifeteimeValidty: Date;
    id? : Number;
    constructor( 
        serialnumber: String,
        type:String,
        responsiblePerson:Pilot,
        foldingDate: Date,
        lifeteimeValidty: Date,
        id? : Number
            
    ){
        this.serialnumber=serialnumber;
        this.type=type;
        this.responsiblePerson=responsiblePerson;
        this.lifeteimeValidty=lifeteimeValidty;
        this.foldingDate=foldingDate;
        this.id=id;
        
    }
}