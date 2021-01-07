import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpEvent } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Pilot } from '../models/pilot.model';
import { AuthService } from './auth.service';
import { Endorsement } from '../models/endorsement.model';


@Injectable({
    providedIn: 'root'
  }) 
export class EndorsementService {
    private url = 'http://176.63.148.61:8080/';

    currentPilot: Pilot;
    httpOptions: any;

    constructor(
        private http: HttpClient,
        private authenticationService: AuthService
    ) {
        this.authenticationService.currentPilot.subscribe(x => this.currentPilot = x);
        this.httpOptions = {
            headers: new HttpHeaders({
                'Content-Type': 'application/json',
                'Access-Control-Allow-Origin': '*',
                'Access-Control-Allow-Headers': '*',
                'Authorization': 'Bearer ' + this.currentPilot.rememberToken
            })
        };
    }


        

    getEndorsement() : Observable<HttpEvent<Endorsement[]>> {
        return this.http
            .get<Endorsement[]>(this.url, this.httpOptions);
    }

    postEndorsement(goal) {
        console.log(JSON.stringify(goal));
     //   return this.http.post<Pilot>(this.url + this.currentUser.userName, JSON.stringify(goal), this.httpOptions);
    }

    updateEndorsement() {
        //return this.http.put<any>(this.url + this.currentUser.userName  +"/" + id, JSON.stringify(goal), this.httpOptions);
    }
    deleteEndorsement() {
        //return this.http.delete<any>(this.url + this.currentUser.userName +"/" + id, this.httpOptions);
    }

}
