import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators, RequiredValidator } from '@angular/forms';
import { SecurityService } from 'src/app/util/services/security/security.service';
import { Router, RouterLink } from '@angular/router';
import { Usuario } from 'src/app/util/interface/user';

@Component({
  selector: 'app-usuario-manter',
  templateUrl: './usuario-manter.component.html',
  styleUrls: ['./usuario-manter.component.scss']
})
export class UsuarioManterComponent implements OnInit {

  form: FormGroup;
  constructor(private fb: FormBuilder,
              private service: SecurityService) { }

  ngOnInit() {
    this.form = this.fb.group({
      nome: [],
      email: [, [Validators.email, Validators.required]],
      user: [, Validators.required],
      password: [, Validators.required],
    });
  }
  save(model: Usuario) {
    this.service.inserir(model);
  }
}
