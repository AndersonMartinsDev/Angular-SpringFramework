import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UsuarioComponent } from './usuario/usuario.component';
import { PerfilComponent } from './perfil/perfil.component';
<<<<<<< HEAD

const routes: Routes = [
  { path: 'usuario', component: UsuarioComponent },
  { path: 'perfil', component: PerfilComponent },
=======
import { PerfilManterComponent } from './perfil/perfil-manter/perfil-manter.component';
import { UsuarioManterComponent } from './usuario/usuario-manter/usuario-manter.component';

const routes: Routes = [
  { path: 'usuario', children:[
    {
      path: '',
      component: UsuarioComponent
    },{
      path: 'manter',
      component: UsuarioManterComponent
    }

  ] },
  { path: 'perfil', children: [
    {
      path: '',
      component: PerfilComponent
     },
    {
      path: 'manter',
      component: PerfilManterComponent,
    }
  ]}
>>>>>>> 5468cdd... Alteração de icones, Header e ajuste de rotas de usuário e perfil, inicio do formulário de usuário
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class SegurancaRoutingModule { }
