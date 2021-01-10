import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpEvent } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Pilot } from '../models/pilot.model';
import { AuthService } from './auth.service';
import { License } from '../models/license.model';


@Injectable({
    providedIn: 'root'
  }) 
export class LicenseService {
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


        

    getLicense() : Observable<HttpEvent<License[]>> {
        return this.http
            .get<License[]>(this.url, this.httpOptions);
    }

    postLicense(goal) {
        console.log(JSON.stringify(goal));
     //   return this.http.post<Pilot>(this.url + this.currentUser.userName, JSON.stringify(goal), this.httpOptions);
    }

    updateLicense() {
        //return this.http.put<any>(this.url + this.currentUser.userName  +"/" + id, JSON.stringify(goal), this.httpOptions);
    }
    deleteLicense() {
        //return this.http.delete<any>(this.url + this.currentUser.userName +"/" + id, this.httpOptions);
    }

}
