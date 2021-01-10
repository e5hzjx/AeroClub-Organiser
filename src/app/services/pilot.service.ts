import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpEvent } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Pilot } from '../models/pilot.model';
import { AuthService } from './auth.service';


@Injectable({
    providedIn: 'root'
  }) 
export class PilotService {
    private url = 'http://176.63.148.61:8080/';

    httpOptions: any;

    constructor(
        private http: HttpClient,
        private authenticationService: AuthService
    ) {
       
        this.httpOptions = {
            headers: new HttpHeaders({
                'Content-Type': 'application/json',
                'Access-Control-Allow-Origin': '*',
                'Access-Control-Allow-Headers': '*',
                'Authorization': 'Bearer ' + localStorage.getItem('token')
            })
        };
    }




    getPilot() : Observable<HttpEvent<Pilot[]>> {
        return this.http
            .get<Pilot[]>(this.url, this.httpOptions);
    }

    postPilot(goal) {
        console.log(JSON.stringify(goal));
     //   return this.http.post<Pilot>(this.url + this.currentUser.userName, JSON.stringify(goal), this.httpOptions);
    }

    updatePilot() {
        //return this.http.put<any>(this.url + this.currentUser.userName  +"/" + id, JSON.stringify(goal), this.httpOptions);
    }
    deletePilot() {
        //return this.http.delete<any>(this.url + this.currentUser.userName +"/" + id, this.httpOptions);
    }

}
