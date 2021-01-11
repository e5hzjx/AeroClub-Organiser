import { Component } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { AuthService } from './services/auth.service';
import { isNull } from '@angular/compiler/src/output/output_ast';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
  
})
export class AppComponent {
  title = 'acmsfrontend';
  data = [];
  action='Bejelentkezés ';
  buttonlink='/login';
  isLoggedin=false;
  constructor(
   private http: HttpClient,
   private authservice:AuthService,
  ) {
    
  
  }
  checkLoggedin(){
    
      this.isLoggedin=(localStorage.getItem('token')==='');
    if(this.isLoggedin==false){

      this.action='Bejelentkezés' ;
      this.buttonlink='/login';
      
  }else{
    this.action='Kijelentkezés';
    this.buttonlink='#';
    this.logOut();
    //TODO Gomb

  }


  }

logOut(){

  this.authservice.logout();
    console.log('logged out');
     
  }
   

}
