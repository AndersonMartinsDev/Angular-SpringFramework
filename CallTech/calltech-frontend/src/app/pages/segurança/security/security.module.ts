import { UsuarioComponent } from '../usuario/usuario.component';
import { PerfilComponent } from '../perfil/perfil.component';
import { SegurancaRoutingModule } from '../seguranca-routing.module';
import { PerfilManterComponent } from '../perfil/perfil-manter/perfil-manter.component';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NzButtonModule, NzFormModule, NzInputModule, NzSelectModule, NzIconModule, NzPageHeaderModule, NzGridModule, NzTreeModule } from 'ng-zorro-antd';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { UsuarioManterComponent } from '../usuario/usuario-manter/usuario-manter.component';
import { SharedModule } from 'src/app/shared/shared/shared.module';



@NgModule({
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
  ]
})
export class SecurityModule { }
