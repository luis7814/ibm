import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AsesorEditComponent } from './editar_asesor.component';

describe('AsesorEditComponent', () => {
  let component: AsesorEditComponent;
  let fixture: ComponentFixture<AsesorEditComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [AsesorEditComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AsesorEditComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
