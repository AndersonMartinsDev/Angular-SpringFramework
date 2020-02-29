import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { NzButtonModule, NzTableModule, NzIconModule, NzGridModule, NzBreadCrumbModule, NzPageHeaderModule, NZ_ICONS, NzTabsModule } from 'ng-zorro-antd';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule, HttpClientJsonpModule } from '@angular/common/http';
import { ChamadoModule } from 'src/app/pages/chamado/chamado.module';
import { IconsProviderModule } from 'src/app/icons-provider.module';
import { IconDefinition } from '@ant-design/icons-angular';
import * as AllIcons from '@ant-design/icons-angular/icons';
import { NzCardModule } from 'ng-zorro-antd/card';

const antDesignIcons = AllIcons as {
  [key: string]: IconDefinition;
};
const icons: IconDefinition[] = Object.keys(antDesignIcons).map(key => antDesignIcons[key]);

@NgModule({
  declarations: [],
  imports: [
<<<<<<< HEAD
    ChamadoModule,
    SecurityModule,
    CommonModule,
=======
    NzButtonModule,
    NzIconModule,
    NzPageHeaderModule,
    NzBreadCrumbModule,
    NzFormModule,
    NzInputModule,
    NzSelectModule,
    NzIconModule,
    NzPageHeaderModule,
    NzBreadCrumbModule,
    NzGridModule,
    ReactiveFormsModule,
    FormsModule,
    NzTabsModule

  ],
  exports: [
>>>>>>> 5468cdd... Alteração de icones, Header e ajuste de rotas de usuário e perfil, inicio do formulário de usuário
    NzButtonModule,
    NzTableModule,
    FormsModule,
    HttpClientModule,
    HttpClientJsonpModule,
    ReactiveFormsModule,
    NzPageHeaderModule,
    NzBreadCrumbModule,
    NzGridModule,
    NzIconModule,
    IconsProviderModule,
    NzCardModule,
    NzTabsModule
  ],
  providers: [{ provide: NZ_ICONS, useValue: icons }],
})
export class SharedModule { }
