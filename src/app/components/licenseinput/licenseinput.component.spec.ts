import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LicenseinputComponent } from './licenseinput.component';

describe('LicenseinputComponent', () => {
  let component: LicenseinputComponent;
  let fixture: ComponentFixture<LicenseinputComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LicenseinputComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LicenseinputComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
