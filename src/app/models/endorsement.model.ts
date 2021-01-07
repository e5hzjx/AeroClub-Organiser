import { Pilot } from "./pilot.model";
import { Planetype } from "./planetype.model";

export class Endorsement{
    planetype:Planetype;
    pilot:Pilot;
    planeTypeDate:Date;
    id?:number;

    constructor(
        planetype:Planetype,
        pilot:Pilot,
        planeTypeDate:Date,
        id?:number,
        
    ){
        this.planetype=planetype;
        this.pilot=pilot;
        this.planeTypeDate=planeTypeDate;
        this.id=id;
              
    }
}