import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
  { path: '', pathMatch: 'full', redirectTo: '/seguranca/login' },
  { path: 'welcome', loadChildren: () => import('./pages/welcome/welcome.module').then(m => m.WelcomeModule) },
  { path: 'chamado', loadChildren: () => import('./pages/chamado/chamado.module').then(m => m.ChamadoModule) },
  { path: 'seguranca', loadChildren: () => import('./pages/seguranca/security.module').then(m => m.SecurityModule) }
];

@NgModule({
  imports: [RouterModule.forRoot(routes,{ enableTracing: false })],
  exports: [RouterModule]
})
export class AppRoutingModule { }
