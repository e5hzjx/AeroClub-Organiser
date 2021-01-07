import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { AuthService } from '../../services/auth.service';
import { Title } from '@angular/platform-browser';
import { Pilot } from 'src/app/models/pilot.model';


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
    private title: Title  ) { }

  ngOnInit() {
    this.title.setTitle('Login');
 
  }
}