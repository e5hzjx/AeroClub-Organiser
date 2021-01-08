import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { AuthService } from '../../services/auth.service';
import { Title } from '@angular/platform-browser';
import { Pilot } from 'src/app/models/pilot.model';
import { PlaneService } from 'src/app/services/plane.service';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})

export class LoginComponent implements OnInit {
 loading = false;
  submitted = false;
  user: Pilot;
  
  constructor(
    private PlaneService:PlaneService,
    private title: Title  ) {
     }
    

    
  ngOnInit() {
    this.title.setTitle('Login');
    this.PlaneService.getPlane()
  }
}

