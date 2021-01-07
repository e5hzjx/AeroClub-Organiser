import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {HttpClientModule} from '@angular/common/http';
import { AppComponent } from './app.component';
import { LoginComponent } from './components/login/login.component';

const routes: Routes = [
  { path: '', component: LoginComponent  },
  { path: 'login', component: LoginComponent  }

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