import { Component, NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {HttpClientModule} from '@angular/common/http';
import { AppComponent } from './app.component';
import { LoginComponent } from './components/login/login.component';
import { DatainputComponent } from './components/datainput/datainput.component';
import { RegisterComponent } from './components/register/register.component';
import { PlaneinputComponent } from './components/planeinput/planeinput.component';
import { PlanetypeinputComponent } from './components/planetypeinput/planetypeinput.component';
import { TransporterinputComponent } from './components/transporterinput/transporterinput.component';
import { ParachuteinputComponent } from './components/parachuteinput/parachuteinput.component';
import { LicenseinputComponent } from './components/licenseinput/licenseinput.component';
import { EndorsementinputComponent } from './components/endorsementinput/endorsementinput.component';

const routes: Routes = [
  { path: '', component: DatainputComponent  },
  { path: 'login', component: LoginComponent  },
  { path: 'crud', component: DatainputComponent},
  { path: 'register', component: RegisterComponent},
  { path: 'planes', component: PlaneinputComponent},
  { path: 'planetype', component: PlanetypeinputComponent },
  { path: 'transport', component: TransporterinputComponent },
  {path: 'para', component: ParachuteinputComponent },
  {path: 'licenses' , component: LicenseinputComponent},
  {path: 'endor' , component: EndorsementinputComponent}

];

@NgModule({

  
  imports: [
    RouterModule.forRoot(routes), 
    
  ],
  providers:[],
  exports: [RouterModule],
  bootstrap: [AppComponent]
})

export class AppRoutingModule { }
/*
Modulok
  minden modul felsorolva

kapcsolótábla a kettő közt 
  sok-sok
Customer
  kinek mi a mi rendelkezésére áll
  ORM rész laravel -> dokumentáció
  GIThub 
*/