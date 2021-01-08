import { Endorsement } from "./endorsement.model";
import { License } from "./license.model";
import { Parachute } from "./parachute.model";
import { Plane } from "./plane.model";
import { Transporter } from "./transporter.model";

export class Pilot{

    name:String;
    email:String;
    password:String;
    rememberToken: String;
    phoneNumber: number;
    dateOfBirth: Date;
    startOfClubMemebership: Date;
    parachutes:Parachute[];
    transporters:Transporter[];
    endorsements:Endorsement[];
    licenses:License[];
    responsibleForPlanes:Plane[];
    id?:number;
    
    constructor(
        name:String,
        email:String,
        password:String,
        rememberToken: String,
        phoneNumber: number,
        dateOfBirth: Date,
        startOfClubMemebership: Date,
        parachutes:Parachute[],
        transporters:Transporter[],
        responsibleForPlanes:Plane[],
        licenses:License[],
        endorsements:Endorsement[],
        id?:number
     ){
        this.name=name;
        this.email=email;
        this.password=password;
        this.rememberToken=rememberToken;
        this.phoneNumber=phoneNumber;
        this.dateOfBirth=dateOfBirth;
        this.startOfClubMemebership=startOfClubMemebership;
        this.parachutes=parachutes;
        this.responsibleForPlanes=responsibleForPlanes;
        this.endorsements=endorsements;
        this.licenses=licenses;
        this.transporters=transporters;
        this.id=id;

    }

}