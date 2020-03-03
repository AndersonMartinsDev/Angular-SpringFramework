import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators, RequiredValidator } from '@angular/forms';

@Component({
  selector: 'app-usuario-manter',
  templateUrl: './usuario-manter.component.html',
  styleUrls: ['./usuario-manter.component.scss']
})
export class UsuarioManterComponent implements OnInit {

  form: FormGroup;
  constructor(private fb: FormBuilder) { }

  ngOnInit() {
    this.form = this.fb.group({
      nome: [],
      email: [, [Validators.email, Validators.required]],
      usuario: [, Validators.required],
      senha: [, Validators.required],
    });
  }
  save(model: FormGroup) {
    if (model.valid) {
      return;
    }
    console.log(model);
  }
}
