import { Component, OnInit } from '@angular/core';
import { FormGroup, Validators, FormBuilder } from '@angular/forms';
import { DemandaService } from 'src/app/util/services/demanda/demanda.service';
import { Demanda } from '../demanda';
import { Chamado } from 'src/app/util/commons/chamado';

@Component({
  selector: 'app-chamado-manter',
  templateUrl: './chamado-manter.component.html',
  styleUrls: ['./chamado-manter.component.scss']
})
export class ChamadoManterComponent implements OnInit {
  form: FormGroup;
  entity: Demanda;
  chamado: Chamado;
  constructor(private fb: FormBuilder, private route: DemandaService) {

  }

  ngOnInit() {
    this.route.getDemanda(1).subscribe((demanda: Demanda) => {
      this.entity = demanda;
    });
    this.initForm();

  }

  saveForm(model): void {
    if (this.form.invalid) {
      return;
    }
    
    model.created = new Date();
    model.status = 'NAO_INICIADO';
    model.chamado = this.formChamado();
    this.route.salvar(model);
  }

  initForm() {
    this.form = this.fb.group({
      titulo: ['', Validators.required],
      natureza: ['', Validators.required],
      descricao: ['', Validators.required]
    });
  }
  formChamado() {
      this.chamado = new Chamado();
      this.chamado.titulo = this.form.get('titulo').value;
      this.chamado.descricao = this.form.get('descricao').value;
      return this.chamado;
  }
}
