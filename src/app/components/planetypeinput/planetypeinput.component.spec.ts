import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PlanetypeinputComponent } from './planetypeinput.component';

describe('PlanetypeinputComponent', () => {
  let component: PlanetypeinputComponent;
  let fixture: ComponentFixture<PlanetypeinputComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PlanetypeinputComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PlanetypeinputComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
