import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AsesorsListComponent } from './listar_asesores.component';

describe('AsesorsListComponent', () => {
  let component: AsesorsListComponent;
  let fixture: ComponentFixture<AsesorsListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AsesorsListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AsesorsListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
