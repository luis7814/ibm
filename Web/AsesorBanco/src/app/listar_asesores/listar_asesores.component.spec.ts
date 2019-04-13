import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AsesoresListComponent } from './listar_asesores.component';

describe('AsesoresListComponent', () => {
  let component: AsesoresListComponent;
  let fixture: ComponentFixture<AsesoresListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AsesoresListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AsesoresListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
