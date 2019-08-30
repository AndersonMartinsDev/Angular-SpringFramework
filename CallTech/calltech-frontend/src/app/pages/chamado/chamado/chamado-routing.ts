import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { ChamadoComponent } from './chamado.component';

const routes: Routes = [{
    path: '',
    component: ChamadoComponent,
    children: [{
        path:'chamado',
        component: ChamadoComponent,
    }]
}];
@NgModule({
    imports: [RouterModule.forChild(routes)],
    exports: [RouterModule],
})
export class ChamadoRoutingModule { }
export const routedComponents = [
    ChamadoComponent,
];


