import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { AuthService } from '../../services/auth.service';
import { Title } from '@angular/platform-browser';
import { Pilot } from 'src/app/models/pilot.model';
import { PlaneService } from 'src/app/services/plane.service';
import { HttpClient } from '@angular/common/http';
import { first } from 'rxjs/operators';
import { FormControl } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})

export class LoginComponent implements OnInit {
 loading = false;
  submitted = false;
  user: Pilot;

  userName= new FormControl('');
  password= new FormControl('');


  //authservice: AuthService;
  constructor(
    private planeService: PlaneService,
    private title: Title  ,
    private authservice:AuthService) {
    }
    
  onSubmit(){
   // this.authservice.login(this.userName.value, this.password.value );

    console.log(this.password.value + this.userName.value);
  
    this.authservice.login(this.userName.value, this.password.value).pipe(first()).subscribe(data=>{
      //this.router.navigate
      console.log('logged in');
      console.log(data);
      
    },
    error=>{
      console.log("error");
    } );
    
  }
    
  ngOnInit() {
    this.title.setTitle('Login');
   
  }
}

