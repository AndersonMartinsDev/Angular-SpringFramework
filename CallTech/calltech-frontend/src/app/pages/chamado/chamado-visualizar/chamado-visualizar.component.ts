import { Component, OnInit } from '@angular/core';
import { Demanda } from '../demanda';
import { DemandaService } from 'src/app/util/services/demanda/demanda.service';

@Component({
  selector: 'app-chamado-visualizar',
  templateUrl: './chamado-visualizar.component.html',
  styleUrls: ['./chamado-visualizar.component.scss']
})
export class ChamadoVisualizarComponent implements OnInit {

  entity: Demanda;

  constructor(private service: DemandaService) {
    this.service.getDemanda(1).subscribe((demanda: Demanda) => {
      this.entity = demanda;
    });
  }

  ngOnInit() {

  }

}
