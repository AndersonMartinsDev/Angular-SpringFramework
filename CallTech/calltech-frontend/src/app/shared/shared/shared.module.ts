import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

// tslint:disable-next-line: max-line-length
import { NzButtonModule, NzTableModule, NzIconModule, NzGridModule, NzBreadCrumbModule, NzPageHeaderModule, NZ_ICONS, NzTabsModule, NzAvatarModule } from 'ng-zorro-antd';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule, HttpClientJsonpModule } from '@angular/common/http';
import { ChamadoModule } from 'src/app/pages/chamado/chamado.module';
import { IconsProviderModule } from 'src/app/icons-provider.module';
import { IconDefinition } from '@ant-design/icons-angular';
import * as AllIcons from '@ant-design/icons-angular/icons';
import { NzCardModule } from 'ng-zorro-antd/card';
import { NzFormModule } from 'ng-zorro-antd';
import { NzInputModule } from 'ng-zorro-antd';
import { NzSelectModule } from 'ng-zorro-antd';
import { BreadcrumbComponent } from './component/breadcrumb/breadcrumb.component';

const antDesignIcons = AllIcons as {
  [key: string]: IconDefinition;
};
const icons: IconDefinition[] = Object.keys(antDesignIcons).map(key => antDesignIcons[key]);

@NgModule({
  declarations: [BreadcrumbComponent],
  imports: [
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
    NzAvatarModule,
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
    NzTabsModule,
    NzFormModule,
  ],
  providers: [{ provide: NZ_ICONS, useValue: icons }],
})
export class SharedModule { }
