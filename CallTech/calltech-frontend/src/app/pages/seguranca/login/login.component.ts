import { Component, OnInit, Output } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { AuthService } from 'src/app/util/services/security/login/auth.service';
import { Usuario } from 'src/app/util/commons/user';
import { EventEmitter } from 'protractor';
import { Router, ActivatedRoute } from '@angular/router';
import { first } from 'rxjs/operators';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  loading = false;
  submitted = false;
  returnUrl: string;
  error = '';

  form: FormGroup;
  private usuario: Usuario;

  constructor(private fb: FormBuilder,
    private authService: AuthService,
    private router: Router,
    private route: ActivatedRoute) {

  }

  ngOnInit() {
    this.form = this.fb.group({
      user: ['', Validators.required],
      senha: ['', Validators.required],
      lembrar: []
    });

    this.returnUrl = this.route.snapshot.queryParams['returnUrl'] || '/';
  }

  get formLogin() {
    return this.form.controls;
  }

  entrar() {

    this.submitted = true;

    if (this.form.invalid) {
      return;
    }

    this.usuario = new Usuario;
    this.usuario.user = this.formLogin.user.value;
    this.usuario.password = this.formLogin.senha.value;


    this.loading = true;

    this.authService.login(this.usuario).pipe(first()).subscribe(
      data => {
        this.router.navigate([this.returnUrl]);
        location.reload();
      },
      error => {
        this.error = error;
        this.loading = false;
      }
    );
  }

}
