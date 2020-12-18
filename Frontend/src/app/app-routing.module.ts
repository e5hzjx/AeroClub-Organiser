import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {HttpClientModule} from '@angular/common/http';
import { AppComponent } from './app.component';
import {CrudComponent} from './crud/crud.component';

const routes: Routes = [
  {path: '', component: CrudComponent}


];

@NgModule({

  
  imports: [
    RouterModule.forRoot(routes), 
    HttpClientModule,
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