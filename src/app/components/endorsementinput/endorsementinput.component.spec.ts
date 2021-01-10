import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { EndorsementinputComponent } from './endorsementinput.component';

describe('EndorsementinputComponent', () => {
  let component: EndorsementinputComponent;
  let fixture: ComponentFixture<EndorsementinputComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EndorsementinputComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EndorsementinputComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
