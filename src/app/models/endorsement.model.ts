import { Pilot } from "./pilot.model";
import { Planetype } from "./planetype.model";

export class Endorsement{
    planetype:Planetype;
    pilot:Pilot;
    id?:number;

    constructor(
        planetype:Planetype,
        pilot:Pilot,
        id?:number,
        
    ){
        this.planetype=planetype;
        this.pilot=pilot;
        this.id=id;
              
    }
}