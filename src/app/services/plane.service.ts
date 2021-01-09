import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpEvent } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Pilot } from '../models/pilot.model';
import { Plane } from '../models/plane.model';
import { AuthService } from './auth.service';


@Injectable({
    providedIn: 'root'
  }) 
export class PlaneService {
    private url = 'http://176.63.148.61:8080/plane/findbyid?id=2';

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
                'Authorization': 'Bearer ' //+ this.currentPilot.rememberToken
            })
        };
    }




    getPlane() : Observable<HttpEvent<Plane[]>> {
        //]>>        
        return this.http.get<Plane[]>(this.url, this.httpOptions);
    }

    postPlane(goal) {
        console.log(JSON.stringify(goal));
     //   return this.http.post<Pilot>(this.url + this.currentUser.userName, JSON.stringify(goal), this.httpOptions);
    }

    updatePlane(id :number, goal) {
        //return this.http.put<any>(this.url + this.currentUser.userName  +"/" + id, JSON.stringify(goal), this.httpOptions);
    }
    deletePlane(id: number) {
        //return this.http.delete<any>(this.url + this.currentUser.userName +"/" + id, this.httpOptions);
    }

}
