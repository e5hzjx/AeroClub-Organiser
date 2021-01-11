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
    private url = 'http://176.63.148.61:8080/plane';

    httpOptions: any;
    
    constructor(
        private http: HttpClient,
        private authenticationService1: AuthService
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




    getPlane() : Observable<HttpEvent<Plane[]>> {
        
        console.log(localStorage.getItem('token'));
        return this.http.get<Plane[]>(this.url +"/findById?id=2" , this.httpOptions);
    }

    postPlane(plane:Plane) {
        console.log(JSON.stringify(plane));
      return this.http.post<Plane>(this.url + '/save', JSON.stringify(plane), this.httpOptions);
    }

    updatePlane(id :number, goal) {
        //return this.http.put<any>(this.url + this.currentUser.userName  +"/" + id, JSON.stringify(goal), this.httpOptions);
    }
    deletePlane(id: number) {
        //return this.http.delete<any>(this.url + this.currentUser.userName +"/" + id, this.httpOptions);
    }

}
