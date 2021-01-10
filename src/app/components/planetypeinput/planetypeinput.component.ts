import { Component, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';
import { Planetype } from 'src/app/models/planetype.model';

@Component({
  selector: 'app-planetypeinput',
  templateUrl: './planetypeinput.component.html',
  styleUrls: ['./planetypeinput.component.scss']
})
export class PlanetypeinputComponent implements OnInit {

  loading:false;

 planeType= new FormControl('');
  //endrosement= new FormControl('');
  
  constructor(
   // private planeService:Planetype,

  ) { }

  onSubmit(){
    

  }

  ngOnInit(): void {
  }

}
