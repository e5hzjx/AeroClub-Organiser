import { Component, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';
import { Transporter } from 'src/app/models/transporter.model';
import { TransporterService } from 'src/app/services/transporter.service';

@Component({
  selector: 'app-transporterinput',
  templateUrl: './transporterinput.component.html',
  styleUrls: ['./transporterinput.component.scss']
})
export class TransporterinputComponent implements OnInit {
  loading:false;

  respPerson= new FormControl('');
  licensePlateNumber= new FormControl('');
  transporterType= new FormControl('');
  planeType = new FormControl('')
  insurance = new FormControl('')

  transporter:Transporter;
  constructor(
    private transporterservice:TransporterService,
  ) { }

  onSubmit(){
    this.transporter=new Transporter(
      null,
      this.licensePlateNumber.value,
      this.planeType.value,
      this.transporterType.value,
      this.insurance.value)
    
      this.transporterservice.postTransporter(this.transporter).subscribe(data=>{
        //this.router.navigate
        console.log('parachute uploaded');
        console.log(data);
        
      },
      error=>{
        console.log("error");
      } );
      
      console.log(this.transporter);
  

    
  }

  ngOnInit(): void {
  }

 
}
