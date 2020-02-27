import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-perfil-manter',
  templateUrl: './perfil-manter.component.html',
  styleUrls: ['./perfil-manter.component.scss']
})
export class PerfilManterComponent implements OnInit {
  form: FormGroup;

  constructor(private fb: FormBuilder) { }

  ngOnInit() {
    this.form = this.fb.group({
      permissao: [, Validators.required]
    });

  }

}
