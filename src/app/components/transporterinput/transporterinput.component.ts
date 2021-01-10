import { Component, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';

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
  planetype = new FormControl('')
  constructor() { }

  onSubmit(){

    
  }

  ngOnInit(): void {
  }

 
}
