import { Component, OnChanges, OnInit } from '@angular/core';
import { EndorsementService } from 'src/app/services/endorsement.service';
import { LicenseService } from 'src/app/services/license.service';
import { ParachuteService } from 'src/app/services/parachute.service';
import { PlaneService } from 'src/app/services/plane.service';
import { PlaneTypeService } from 'src/app/services/planetype.service';
import { TransporterService } from 'src/app/services/transporter.service';

@Component({
  selector: 'app-datainput',
  templateUrl: './datainput.component.html',
  styleUrls: ['./datainput.component.scss']
})
export class DatainputComponent implements OnInit, OnChanges{
  selectedType: Number;
  dataTypes= [
    { id: 1, value: 'Repülő' },
    { id: 2, value: 'Géptípus' },
    { id: 3, value: 'Szakszó' },
    
  ]

  constructor(
    /*private planeService: PlaneService,
    private planeTypeService: PlaneTypeService,
    private licenseService: LicenseService,
    private endorsementService: EndorsementService,
    private transporterService: TransporterService,
    private parachuteService: ParachuteService,
    */
  ) { 



  }
  ngOnChanges():void{
    console.log(this.selectedType);
  


  }
  ngOnInit(): void {
    console.log(this.selectedType);
  }

}
