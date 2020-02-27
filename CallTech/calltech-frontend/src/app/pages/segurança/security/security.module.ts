import { UsuarioComponent } from '../usuario/usuario.component';
import { PerfilComponent } from '../perfil/perfil.component';
import { SegurancaRoutingModule } from '../seguranca-routing.module';
import { PerfilManterComponent } from '../perfil/perfil-manter/perfil-manter.component';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NzButtonModule, NzFormModule, NzInputModule, NzSelectModule, NzIconModule, NzPageHeaderModule, NzGridModule } from 'ng-zorro-antd';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    UsuarioComponent,
    PerfilComponent,
    PerfilManterComponent],
  imports: [
    SegurancaRoutingModule,
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
  ]
})
export class SecurityModule { }
