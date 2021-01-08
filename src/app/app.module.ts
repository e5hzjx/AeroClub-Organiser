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

const routes:Routes = [
 
];

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    DatainputComponent,
 
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes),
    AppRoutingModule
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
