import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {ChamadoComponent} from './chamado.component';
import {ChamadoRoutingModule} from './chamado-routing';

@NgModule({
  declarations: [ChamadoComponent],
  imports: [
    CommonModule,
    ChamadoRoutingModule,
  ],
})
export class ChamadoModule {}
