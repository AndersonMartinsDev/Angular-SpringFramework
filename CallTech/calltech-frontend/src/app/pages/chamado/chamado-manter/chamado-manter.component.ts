import { Component, OnInit } from '@angular/core';
import { FormGroup, Validators, FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-chamado-manter',
  templateUrl: './chamado-manter.component.html',
  styleUrls: ['./chamado-manter.component.scss']
})
export class ChamadoManterComponent implements OnInit {
  validateForm: FormGroup;
  constructor(private fb: FormBuilder) { }

  ngOnInit() {
    this.validateForm = this.fb.group({
      fieldA: [null, [Validators.required]],
      descricao: [null, [Validators.required]]
    });
  }

}
