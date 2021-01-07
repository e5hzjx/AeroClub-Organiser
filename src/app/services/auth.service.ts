import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Router, ActivatedRoute } from '@angular/router';
import { Observable, BehaviorSubject } from 'rxjs';
import { map } from 'rxjs/operators';
import { Pilot } from '../models/pilot.model';


@Injectable({ providedIn: 'root' })
export class AuthService {
    private currentPilotSubject: BehaviorSubject<Pilot>;
    public currentPilot: Observable<Pilot>;
    private url = ' http://176.63.148.61:8080/';

    constructor(
        private http: HttpClient,
        private route: ActivatedRoute,
        private router: Router
    ){
        this.currentPilotSubject = new BehaviorSubject<Pilot>(JSON.parse(localStorage.getItem('currentPilot')));
        this.currentPilot = this.currentPilotSubject.asObservable();
    }

    private httpOptions = {
        headers: new HttpHeaders({
          'Content-Type':  'application/json',
          'Access-Control-Allow-Origin': '*',
          'Access-Control-Allow-Headers' : '*'
        })
    };

    public get currentPilotValue(): Pilot {
        return this.currentPilotSubject.value;
    }

    login(username, password) {
        return this.http.post<any>(this.url + '/signin', { username, password }, this.httpOptions)
            .pipe(map(data => {
                // store user details and jwt token in local storage to keep user logged in between page refreshes
                const pilot =  new Pilot(  //sorrend még lehet nem megfelelő
                    data.rememberToken,
                    data.name,
                    data.email,
                    data.password,
                    data.phoneNumber,
                    data.dateOfBirth,
                    data.startOfClubMemebership );
                console.log(pilot);
                localStorage.setItem('currentPilot', JSON.stringify(pilot));
                this.currentPilotSubject.next(pilot);
                return pilot;
            }));
    }

    logout() {
        // remove user from local storage and set current user to null
        localStorage.removeItem('currentPilot');
       // this.currentPilotSubject.unsubscribe();
        this.currentPilotSubject.next(null);
    }

    register(username, email, password) {
        return this.http.post<any>(this.url + '/signup', { username, email, password }, this.httpOptions).subscribe( 
            data => {
                console.log("Pilot is registered succesfully!");
                setTimeout(() => {
                    alert("Pilot is registered succesfully!");
                    this.router.navigate(['/signin']);
                  },
                    1000);
            },
            err => {
                return console.log(err);
            }
        )
    };
}
