import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ChamadoListarComponent } from './chamado-listar/chamado-listar.component';
import { ChamadoVisualizarComponent } from './chamado-visualizar/chamado-visualizar.component';
import { ChamadoManterComponent } from './chamado-manter/chamado-manter.component';

const routes: Routes = [
  { path: '', component: ChamadoListarComponent },
  { path: 'visualizar', component: ChamadoVisualizarComponent },
  { path: 'manter', component: ChamadoManterComponent },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ChamadoRoutingModule { }
