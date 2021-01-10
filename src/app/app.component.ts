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
  
  constructor(
   private http: HttpClient,
   private authservice:AuthService,
  ) {
    
  
  }
  checkLoggedin(){
    if(localStorage.getItem('token')!==''){
      this.action='Kijelentkezés' ;
      this.buttonlink='';
      this.logOut();
  }else{
    this.action='Bejelentkezés ';
    this.buttonlink='/login';
    
    //TODO Gomb

  }


  }

logOut(){

  this.authservice.logout();
    console.log('logged out');
     
  }
   

}
