import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { UsuarioComponent } from '../usuario/usuario.component';
import { PerfilComponent } from '../perfil/perfil.component';
import { SegurancaRoutingModule } from '../seguranca-routing.module';
<<<<<<< HEAD
=======
import { PerfilManterComponent } from '../perfil/perfil-manter/perfil-manter.component';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NzButtonModule, NzFormModule, NzInputModule, NzSelectModule, NzIconModule, NzPageHeaderModule, NzGridModule, NzTreeModule } from 'ng-zorro-antd';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { UsuarioManterComponent } from '../usuario/usuario-manter/usuario-manter.component';
import { SharedModule } from 'src/app/shared/shared/shared.module';
>>>>>>> 5468cdd... Alteração de icones, Header e ajuste de rotas de usuário e perfil, inicio do formulário de usuário



@NgModule({
<<<<<<< HEAD
  declarations: [ UsuarioComponent, PerfilComponent],
  imports: [
    SegurancaRoutingModule,
    CommonModule
=======
  declarations: [
    UsuarioComponent,
    UsuarioManterComponent,
    PerfilComponent,
    PerfilManterComponent,
    ],
  imports: [
    SegurancaRoutingModule,
    SharedModule,
    NzFormModule,
    NzInputModule,
    NzSelectModule,
    NzIconModule,
    NzPageHeaderModule,
    NzGridModule,
    CommonModule,
    NzButtonModule,
    NzFormModule,
    NzInputModule,
    ReactiveFormsModule,
    FormsModule,
    NzTreeModule,
>>>>>>> 5468cdd... Alteração de icones, Header e ajuste de rotas de usuário e perfil, inicio do formulário de usuário
  ]
})
export class SecurityModule { }
