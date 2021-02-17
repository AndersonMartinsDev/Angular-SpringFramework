
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NgZorroAntdModule, NZ_I18N, pt_BR, NZ_ICONS, NzCardModule } from 'ng-zorro-antd';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { registerLocaleData } from '@angular/common';
import pt from '@angular/common/locales/pt';
import { ScrollingModule } from '@angular/cdk/scrolling';
import { DragDropModule } from '@angular/cdk/drag-drop';
import { SharedModule } from './shared/shared/shared.module';
import { ReactiveFormsModule } from '@angular/forms';
import { NzButtonModule } from 'ng-zorro-antd';
import { AuthService } from './util/services/security/login/auth.service';
registerLocaleData(pt);

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    AppRoutingModule,
    NgZorroAntdModule,
    BrowserAnimationsModule,
    NgZorroAntdModule,
    BrowserAnimationsModule,
    ScrollingModule,
    DragDropModule,
    ReactiveFormsModule,
    NzCardModule,
  ],
  exports: [NzButtonModule,SharedModule],
  providers: [{ provide: NZ_I18N, useValue: pt_BR },AuthService],
  bootstrap: [AppComponent]
})
export class AppModule { }
