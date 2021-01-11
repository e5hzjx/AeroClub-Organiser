import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpEvent } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Pilot } from '../models/pilot.model';
import { AuthService } from './auth.service';
import { Transporter } from '../models/transporter.model';


@Injectable({
    providedIn: 'root'
  }) 
export class TransporterService {
    private url = 'http://176.63.148.61:8080/transporter';

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




    getTransporter() : Observable<HttpEvent<Transporter[]>> {
        return this.http
            .get<Transporter[]>(this.url, this.httpOptions);
    }

    postTransporter(transporter:Transporter) {
        console.log(JSON.stringify(transporter));
        
        return this.http.post<Transporter>(this.url + '/save', JSON.stringify(transporter), this.httpOptions);
   }

    updateTransporter(id :number, goal) {
        //return this.http.put<any>(this.url + this.currentUser.userName  +"/" + id, JSON.stringify(goal), this.httpOptions);
    }
    deleteTransporter(id: number) {
        //return this.http.delete<any>(this.url + this.currentUser.userName +"/" + id, this.httpOptions);
    }

}
