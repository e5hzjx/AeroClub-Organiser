import { Component, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';

@Component({
  selector: 'app-endorsementrinput',
  templateUrl: './endorsementinput.component.html',
  styleUrls: ['./endorsementinput.component.scss']
})
export class EndorsementinputComponent implements OnInit {

  loading:false;

  planeType= new FormControl('');
  
  constructor() { }

  onSubmit(){
    
  }

  ngOnInit(): void {
  }

}
