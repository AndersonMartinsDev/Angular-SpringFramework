import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UsuarioComponent } from './usuario/usuario.component';
import { PerfilComponent } from './perfil/perfil.component';
import { PerfilManterComponent } from './perfil/perfil-manter/perfil-manter.component';
import { UsuarioManterComponent } from './usuario/usuario-manter/usuario-manter.component';
import { LoginComponent } from './login/login.component';


const routes: Routes = [
  { path: '', pathMatch: 'full', redirectTo: '/seguranca/login' },

  {
    path: 'login', children: [
      {
        path: '',
        component: LoginComponent
      }
    ]
  },
  {
    path: 'usuario', children: [
      {
        path: '',
        component: UsuarioComponent
      }, {
        path: 'manter',
        component: UsuarioManterComponent
      }

    ]
  },
  {
    path: 'perfil', children: [
      {
        path: '',
        component: PerfilComponent
      },
      {
        path: 'manter',
        component: PerfilManterComponent,
      }
    ]
  }
];

@NgModule({
  imports: [
    RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class SegurancaRoutingModule { }
