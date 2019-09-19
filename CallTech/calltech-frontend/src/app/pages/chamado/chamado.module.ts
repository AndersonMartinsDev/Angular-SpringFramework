import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ChamadoListarComponent } from './chamado-listar/chamado-listar.component';
import { NzTableModule, NzModalModule, NzButtonModule, NzIconModule, NzBreadCrumbModule, NzFormModule, NzInputModule, NzSelectModule } from 'ng-zorro-antd';
import { ChamadoRoutingModule } from './chamado-routing.module';
import { ChamadoVisualizarComponent } from './chamado-visualizar/chamado-visualizar.component';
import { ChamadoManterComponent } from './chamado-manter/chamado-manter.component';
import { NzPageHeaderModule } from 'ng-zorro-antd/page-header';


@NgModule({
  declarations: [ ChamadoListarComponent, ChamadoVisualizarComponent, ChamadoManterComponent],
  imports: [
    CommonModule,
    NzTableModule,
    NzModalModule,
    ChamadoRoutingModule,
    NzButtonModule,
    NzIconModule,
    NzPageHeaderModule,
    NzBreadCrumbModule,
    NzFormModule,
    NzInputModule,
    NzSelectModule,
  ],
  bootstrap: [ ChamadoListarComponent ]
})
export class ChamadoModule { }
