import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ChamadoManterComponent } from './chamado-manter.component';

describe('ChamadoManterComponent', () => {
  let component: ChamadoManterComponent;
  let fixture: ComponentFixture<ChamadoManterComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ChamadoManterComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ChamadoManterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
