import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TransporterinputComponent } from './transporterinput.component';

describe('TransporterinputComponent', () => {
  let component: TransporterinputComponent;
  let fixture: ComponentFixture<TransporterinputComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TransporterinputComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TransporterinputComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
