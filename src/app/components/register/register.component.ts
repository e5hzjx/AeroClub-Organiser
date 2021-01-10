import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, FormsModule, ReactiveFormsModule, FormBuilder } from '@angular/forms';
import { AuthService } from 'src/app/services/auth.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss']
})
export class RegisterComponent implements OnInit {
  loading: false;
  user: String;
//password: String;
  email: String; 
 
  userName= new FormControl('');
  emailAdress= new FormControl('');
  password= new FormControl('');

  constructor(
    private authservice: AuthService,
  
    ) { 

  }

  onSubmit(){
    //this.authservice.register("Kutya30" ,"kutamail30" ,"kutyapass30");
    this.authservice.register(this.userName.value ,this.emailAdress.value ,this.password.value);
    //this.authservice.register(this.userName ,this.emailAdress ,this.password);
    //console.log(this.user, this.email, this.password);
    console.log(this.userName.value + this.emailAdress.value + this.password.value);
  }

  ngOnInit(): void {
  }

}
