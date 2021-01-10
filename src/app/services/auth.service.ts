import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Router, ActivatedRoute } from '@angular/router';
import { Observable, BehaviorSubject } from 'rxjs';
import { map } from 'rxjs/operators';
import { Pilot } from '../models/pilot.model';


@Injectable({ providedIn: 'root' })
export class AuthService {
    private url = ' http://176.63.148.61:8080/api/auth';

    constructor(
        private http: HttpClient,
        private route: ActivatedRoute,
        private router: Router
    ){
    
    }

    private httpOptions = {
        headers: new HttpHeaders({
          'Content-Type':  'application/json',
          'Access-Control-Allow-Origin': '*',
          'Access-Control-Allow-Headers' : '*'
        })
    };

  
    login(username, password) {

        return this.http.post<any>(this.url + '/login', { username, password }, this.httpOptions)
            .pipe(map(data => {
        console.log(data);
                // store user details and jwt token in local storage to keep user logged in between page refreshes
                const pilot =  new Pilot(  //sorrend még lehet nem megfelelő
                    data.username,
                    data.email,
                    data.password,
                    data.rememberToken,
                    data.phoneNumber,
                    data.dateOfBirth,
                    data.startOfClubMemebership,
                    data.parachutes,
                    data.transporters,
                    data.responsibleForPlanes,
                    data.licenses,
                    data.endorsements,
                    data.id
                    );
                console.log(pilot);
                //localStorage.setItem('currentPilot', JSON.stringify(pilot));
                localStorage.setItem('token',data.accessToken);
                console.log(data.accessToken);
                return pilot;
            }));
    }

    logout() {
        // remove user from local storage and set current user to null
        localStorage.removeItem('token');
      
    }

    register(username, email, password) {
        return this.http.post<any>(this.url + '/register', { username, email, password }, this.httpOptions).subscribe( 
            data => {
                console.log("Pilot is registered succesfully!");
                setTimeout(() => {
                    alert("Pilot is registered succesfully!");
                    this.router.navigate(['/login']);
                  },
                    1000);
            },
            err => {
                return console.log(err);
            }
        )
    };
}
