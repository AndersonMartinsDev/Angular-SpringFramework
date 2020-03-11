import { fakeAsync, ComponentFixture, TestBed } from '@angular/core/testing';
import { ChamadoListarComponent } from './chamado-listar.component';

describe('ChamadoListarComponent', () => {
  let component: ChamadoListarComponent;
  let fixture: ComponentFixture<ChamadoListarComponent>;

  beforeEach(fakeAsync(() => {
    TestBed.configureTestingModule({
      declarations: [ ChamadoListarComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ChamadoListarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should compile', () => {
    expect(component).toBeTruthy();
  });
});
