import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UsuarioComponent } from './usuario/usuario.component';
import { PerfilComponent } from './perfil/perfil.component';
import { PerfilManterComponent } from './perfil/perfil-manter/perfil-manter.component';

const routes: Routes = [
  { path: 'usuario', component: UsuarioComponent },
  { path: 'perfil', component: PerfilComponent },
  { path: 'perfil-manter', component: PerfilComponent },
];

@NgModule({
  imports: [
    RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class SegurancaRoutingModule { }
