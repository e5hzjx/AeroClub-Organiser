import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PlaneinputComponent } from './planeinput.component';

describe('PlaneinputComponent', () => {
  let component: PlaneinputComponent;
  let fixture: ComponentFixture<PlaneinputComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PlaneinputComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PlaneinputComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
