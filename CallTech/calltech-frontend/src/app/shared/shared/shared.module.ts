import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { SecurityModule } from 'src/app/pages/segurança/security/security.module';
import { NzButtonModule, NzTableModule, NzIconModule, NzGridModule, NzBreadCrumbModule, NzPageHeaderModule, NZ_ICONS } from 'ng-zorro-antd';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule, HttpClientJsonpModule } from '@angular/common/http';
import { ChamadoModule } from 'src/app/pages/chamado/chamado.module';
import { IconsProviderModule } from 'src/app/icons-provider.module';
import { IconDefinition } from '@ant-design/icons-angular';
import * as AllIcons from '@ant-design/icons-angular/icons';

const antDesignIcons = AllIcons as {
  [key: string]: IconDefinition;
};
const icons: IconDefinition[] = Object.keys(antDesignIcons).map(key => antDesignIcons[key]);

@NgModule({
  declarations: [],
  imports: [
    ChamadoModule,
    SecurityModule,
    CommonModule,
    NzButtonModule,
    NzTableModule,
    BrowserModule,
    FormsModule,
    HttpClientModule,
    HttpClientJsonpModule,
    ReactiveFormsModule,
    NzPageHeaderModule,
    NzBreadCrumbModule,
    NzGridModule,
    NzIconModule,
    IconsProviderModule,
  ],
  providers: [{ provide: NZ_ICONS, useValue: icons }],
})
export class SharedModule { }
