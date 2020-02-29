import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UsuarioManterComponent } from './usuario-manter.component';

describe('UsuarioManterComponent', () => {
  let component: UsuarioManterComponent;
  let fixture: ComponentFixture<UsuarioManterComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UsuarioManterComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UsuarioManterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
