import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PerfilManterComponent } from './perfil-manter.component';

describe('PerfilManterComponent', () => {
  let component: PerfilManterComponent;
  let fixture: ComponentFixture<PerfilManterComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PerfilManterComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PerfilManterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
