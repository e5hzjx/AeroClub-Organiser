import { Component, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';
import { Parachute } from 'src/app/models/parachute.model';
import { ParachuteService } from 'src/app/Services/parachute.service';

@Component({
  selector: 'app-parachuteinput',
  templateUrl: './parachuteinput.component.html',
  styleUrls: ['./parachuteinput.component.scss']
})
export class ParachuteinputComponent implements OnInit {
  loading:false;

  paraType= new FormControl('');
  serialNumber= new FormControl('');
  respPerson= new FormControl('');
  lastFold=new FormControl('');
  lifeValid=new FormControl('');
  insurance=new FormControl('');

  data1='1';
  data2='2';
  data3='3';
  data4='4';

  parachute:Parachute;
  constructor(
    private parachuteService:ParachuteService,
  ) { }

  
  onSubmit(){
    this.parachute=new Parachute(
     this.paraType.value,
     this.serialNumber.value,
    // this.respPerson.value,
     null,
     this.lastFold.value,
     this.insurance.value,
     )
   
     this.parachuteService.postParachute(this.parachute).subscribe(data=>{
       //this.router.navigate
       console.log('parachute uploaded');
       console.log(data);
       
     },
     error=>{
       console.log("error");
     } );
     
     console.log(this.parachute);
 }

getPara(){

}

  ngOnInit(): void {
  }

}
