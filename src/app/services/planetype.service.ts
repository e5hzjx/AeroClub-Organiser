import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpEvent } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Pilot } from '../models/pilot.model';
import { AuthService } from './auth.service';
import { Planetype } from '../models/planetype.model';


@Injectable({
    providedIn: 'root'
  }) 
export class PlaneTypeService {
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




    getPlaneType() : Observable<HttpEvent<Planetype[]>> {
        return this.http
            .get<Planetype[]>(this.url, this.httpOptions);
    }

    postPlaneType(goal) {
        console.log(JSON.stringify(goal));
     //   return this.http.post<Pilot>(this.url + this.currentUser.userName, JSON.stringify(goal), this.httpOptions);
    }

    updatePlaneType(id :number, goal) {
        //return this.http.put<any>(this.url + this.currentUser.userName  +"/" + id, JSON.stringify(goal), this.httpOptions);
    }
    deletePlaneType(id: number) {
        //return this.http.delete<any>(this.url + this.currentUser.userName +"/" + id, this.httpOptions);
    }

}
