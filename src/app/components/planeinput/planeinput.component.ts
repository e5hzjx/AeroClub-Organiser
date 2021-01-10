import { Component, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';
import { Plane } from 'src/app/models/plane.model';
import { PlaneService } from 'src/app/services/plane.service';

@Component({
  selector: 'app-planeinput',
  templateUrl: './planeinput.component.html',
  styleUrls: ['./planeinput.component.scss']
})
export class PlaneinputComponent implements OnInit {
  loading:false;

  tailNumber= new FormControl('');
  regNumber= new FormControl('');
  planeType= new FormControl('');
  respPerson= new FormControl('');
  airValid= new FormControl('');
  insurance= new FormControl('');
  repair= new FormControl('');

  plane:Plane;

  constructor(
    private planeService:PlaneService,
    
  ) { }

  onSubmit(){
     this.plane=new Plane(
      this.tailNumber.value,
      this.regNumber.value,
      this.planeType.value,
      this.respPerson.value,
      this.airValid.value,
      this.insurance.value,
      this.repair.value,
      )
    
      this.planeService.postPlane(this.plane).subscribe(data=>{
        //this.router.navigate
        console.log('plane uploaded');
        console.log(data);
        
      },
      error=>{
        console.log("error");
      } );
      
      console.log(this.plane);
  }

  ngOnInit(): void {
  }

}
