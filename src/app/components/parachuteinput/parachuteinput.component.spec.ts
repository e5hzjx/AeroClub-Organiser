import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ParachuteinputComponent } from './parachuteinput.component';

describe('ParachuteinputComponent', () => {
  let component: ParachuteinputComponent;
  let fixture: ComponentFixture<ParachuteinputComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ParachuteinputComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ParachuteinputComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
