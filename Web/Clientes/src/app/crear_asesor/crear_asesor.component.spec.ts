import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AsesorCreateComponent } from './crear_asesor.component';

describe('AsesorCreateComponent', () => {
  let component: AsesorCreateComponent;
  let fixture: ComponentFixture<AsesorCreateComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AsesorCreateComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AsesorCreateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
