import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { UsuarioComponent } from '../usuario/usuario.component';
import { PerfilComponent } from '../perfil/perfil.component';
import { SegurancaRoutingModule } from '../seguranca-routing.module';



@NgModule({
  declarations: [ UsuarioComponent, PerfilComponent],
  imports: [
    SegurancaRoutingModule,
    CommonModule
  ]
})
export class SecurityModule { }
