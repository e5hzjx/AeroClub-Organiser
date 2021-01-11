import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpEvent } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Pilot } from '../models/pilot.model';
import { Plane } from '../models/plane.model';
import { AuthService } from './auth.service';
import { Parachute } from '../models/parachute.model';


@Injectable({
    providedIn: 'root'
  }) 
export class ParachuteService {
    private url = 'http://176.63.148.61:8080/parachute';

    httpOptions: any;

    constructor(
        private http: HttpClient,
        private authenticationService3: AuthService
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




    getParachute() : void {
        //Observable<HttpEvent<Plane[]>>        
         this.http
            .get<Plane[]>(this.url, this.httpOptions).subscribe((resp)=>{console.log(resp + "asd")});
    }

    postParachute(parachute:Parachute) {
        console.log(JSON.stringify(parachute));
        return this.http.post<Parachute>(this.url + '/save', JSON.stringify(parachute), this.httpOptions);
    }

    updateParachute(id :number, goal) {
        //return this.http.put<any>(this.url + this.currentUser.userName  +"/" + id, JSON.stringify(goal), this.httpOptions);
    }
    deleteParachute(id: number) {
        //return this.http.delete<any>(this.url + this.currentUser.userName +"/" + id, this.httpOptions);
    }

}
