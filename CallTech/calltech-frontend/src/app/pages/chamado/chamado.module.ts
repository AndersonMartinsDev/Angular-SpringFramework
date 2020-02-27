import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ChamadoListarComponent } from './chamado-listar/chamado-listar.component';
import { NzTableModule, NzModalModule, NzButtonModule,
  NzIconModule, NzBreadCrumbModule, NzFormModule, NzInputModule, NzSelectModule, NzGridModule, NzCardModule } from 'ng-zorro-antd';
import { ChamadoRoutingModule } from './chamado-routing.module';
import { ChamadoVisualizarComponent } from './chamado-visualizar/chamado-visualizar.component';
import { ChamadoManterComponent } from './chamado-manter/chamado-manter.component';
import { NzPageHeaderModule } from 'ng-zorro-antd/page-header';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { SharedModule } from 'src/app/shared/shared/shared.module';


@NgModule({
  declarations: [ ChamadoListarComponent, ChamadoVisualizarComponent, ChamadoManterComponent],
  imports: [
    ChamadoRoutingModule,
    CommonModule,
    NzTableModule,
    NzModalModule,
    NzButtonModule,
    NzIconModule,
    NzBreadCrumbModule,
    NzFormModule,
    NzInputModule,
    NzSelectModule,
    NzIconModule,
    NzPageHeaderModule,
    NzGridModule,
    ReactiveFormsModule,
    FormsModule,
    CommonModule,
    NzCardModule,
  ],
  bootstrap: [ ChamadoListarComponent ]
})
export class ChamadoModule { }
