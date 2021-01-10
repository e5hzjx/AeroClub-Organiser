import { Component, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';

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
  constructor() { }

  onSubmit(){
    
  }

  ngOnInit(): void {
  }

}
