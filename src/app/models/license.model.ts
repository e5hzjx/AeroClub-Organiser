import { Pilot } from "./pilot.model";

export class License{

    dateOfInitialIssue:Date;
    licenseNumber:number;
    pilot:Pilot;
    id?:number;
    constructor(
        dateOfInitialIssue:Date,
        licenseNumber:number,
        pilot:Pilot,
        id?:number,      
    ){
        this.dateOfInitialIssue=dateOfInitialIssue;
        this.licenseNumber=licenseNumber;
        this.pilot=pilot;
        this.id=id;
    }


}