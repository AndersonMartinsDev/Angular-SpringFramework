import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ChamadoVisualizarComponent } from './chamado-visualizar.component';

describe('ChamadoVisualizarComponent', () => {
  let component: ChamadoVisualizarComponent;
  let fixture: ComponentFixture<ChamadoVisualizarComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ChamadoVisualizarComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ChamadoVisualizarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
