import { Component, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';

@Component({
  selector: 'app-licenseinput',
  templateUrl: './licenseinput.component.html',
  styleUrls: ['./licenseinput.component.scss']
})
export class LicenseinputComponent implements OnInit {

  loading:false;

  dateOfIssue= new FormControl('');
  licenseNum= new FormControl('');
  
  constructor() { }

  onSubmit(){
    
  }

  ngOnInit(): void {
  }

}
