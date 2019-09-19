import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ChamadoListarComponent } from './chamado-listar/chamado-listar.component';
import { ChamadoVisualizarComponent } from './chamado-visualizar/chamado-visualizar.component';

const routes: Routes = [
  { path: '', component: ChamadoListarComponent },
  { path: 'visualizar', component: ChamadoVisualizarComponent },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ChamadoRoutingModule { }
