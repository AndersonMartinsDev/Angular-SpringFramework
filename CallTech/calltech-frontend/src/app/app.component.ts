import { Component } from '@angular/core';
import { AuthService } from './util/services/security/login/auth.service';
import { EventEmitter } from 'protractor';
import { Router, ActivatedRoute } from '@angular/router';
import { Usuario } from './util/commons/user';

const userList = ['U', 'Lucy', 'Tom', 'Edward'];
const colorList = ['#f56a00', '#7265e6', '#ffbf00', '#00a2ae'];

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  [x: string]: any;

  mostrarMenu: boolean = false;

  currentUser: Usuario;

  text: string = userList[3];
  color: string = colorList[3];

  constructor(
    private authService: AuthService,
    private router: Router,
    private route: ActivatedRoute
  ) {
    this.authService.currentUser.subscribe(x=>this.currentUser = x);
    this.showMenu(this.currentUser);
  }

  showMenu(user:Usuario){
    if(user){
      this.mostrarMenu = true;
      this.router.navigate(['/welcome']);
    }
  }

  logout(){
    this.authService.logout();
    this.router.navigate(['/seguranca/login']);
  }

  change(): void {
    let idx = userList.indexOf(this.text);
    ++idx;
    if (idx === userList.length) {
      idx = 0;
    }
    this.text = userList[idx];
    this.color = colorList[idx];
  }
}
