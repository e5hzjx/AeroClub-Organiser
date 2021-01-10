import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { Routes, RouterModule } from '@angular/router';
import { PlaneService } from './services/plane.service';
import { PlaneTypeService } from './services/planetype.service';
import { EndorsementService } from './services/endorsement.service';
import { LicenseService } from './services/license.service';
import { PilotService } from './services/pilot.service';
import { TransporterService } from './services/transporter.service';
import { LoginComponent } from './components/login/login.component';
import { DatainputComponent } from './components/datainput/datainput.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { RegisterComponent } from './components/register/register.component';
import { PlaneinputComponent } from './components/planeinput/planeinput.component';
import { PlanetypeinputComponent } from './components/planetypeinput/planetypeinput.component';
import { ParachuteinputComponent } from './components/parachuteinput/parachuteinput.component';
import { TransporterinputComponent } from './components/transporterinput/transporterinput.component';
import { EndorsementinputComponent } from './components/endorsementinput/endorsementinput.component';
import { LicenseinputComponent } from './components/licenseinput/licenseinput.component';
import { HttpClientModule } from '@angular/common/http';
import {MatCardModule} from '@angular/material/card';



const routes:Routes = [
 
];

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    DatainputComponent,
    RegisterComponent,
    PlaneinputComponent,
    PlanetypeinputComponent,
    ParachuteinputComponent,
    TransporterinputComponent,
    EndorsementinputComponent,
    LicenseinputComponent,
 
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes),
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    MatCardModule,
    ],
  providers: [PlaneService,
              PlaneTypeService,
              EndorsementService,
              LicenseService,
              PilotService,
              TransporterService],
  bootstrap: [AppComponent]
})
export class AppModule { }
