import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {ChamadoComponent} from './chamado.component';
import {ChamadoRoutingModule} from './chamado-routing';
const components = [ChamadoComponent];
@NgModule({
  declarations: [ChamadoComponent],
  imports: [
    CommonModule,
    ChamadoRoutingModule
  ]
})
export class ChamadoModule {}
