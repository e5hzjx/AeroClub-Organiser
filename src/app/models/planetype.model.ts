import { Endorsement } from "./endorsement.model";
import { Plane } from "./plane.model";

export class Planetype{
    type: String;
    planes: Plane[];
    endorsement: Endorsement;
    id? : number;
    
    constructor(type: String,planes:Plane[],endorsement: Endorsement, id? :number){

        this.type =type;
        this.planes=planes;
        this.endorsement= endorsement;
        this.id =id;
        
    }
}