export class Pilot{

    name:String;
    email:String;
    password:String;
    rememberToken: String;
    phoneNumber: number;
    dateOfBirth: Date;
    startOfClubMemebership: Date;

    id?:number;
    
    constructor(
        name:String,
        email:String,
        password:String,
        rememberToken: String,
        phoneNumber: number,
        dateOfBirth: Date,
        startOfClubMemebership: Date,
        id?:number,
     ){
        this.name=name;
        this.email=email;
        this.password=password;
        this.rememberToken=rememberToken;
        this.phoneNumber=phoneNumber;
        this.dateOfBirth=dateOfBirth;
        this.startOfClubMemebership=startOfClubMemebership;
        this.id=id;

    }

}