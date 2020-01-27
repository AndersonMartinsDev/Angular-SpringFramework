import { Component, OnInit } from '@angular/core';
import { FormGroup, Validators, FormBuilder } from '@angular/forms';
import { DemandaService } from 'src/app/util/services/demanda/demanda.service';
import { Demanda } from '../demanda';

@Component({
  selector: 'app-chamado-manter',
  templateUrl: './chamado-manter.component.html',
  styleUrls: ['./chamado-manter.component.scss']
})
export class ChamadoManterComponent implements OnInit {
  form: FormGroup;
  entity: Demanda;
  constructor(private fb: FormBuilder, private route: DemandaService) { }

  ngOnInit() {
    this.route.getDemanda(1).subscribe((demanda: Demanda) => {
      this.entity = demanda;
    });

    this.form = this.fb.group({
      titulo: [this.entity.chamado.titulo, [Validators.required]],
      natureza: [this.entity.chamado, [Validators.required]],
      descricao: [this.entity, [Validators.required]]
    });
  }

  saveForm(model): void {

  }

}
