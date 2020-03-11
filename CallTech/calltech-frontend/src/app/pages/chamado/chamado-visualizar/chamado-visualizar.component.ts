import { Component, OnInit } from '@angular/core';
import { Demanda } from '../demanda';
import { DemandaService } from 'src/app/util/services/demanda/demanda.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-chamado-visualizar',
  templateUrl: './chamado-visualizar.component.html',
  styleUrls: ['./chamado-visualizar.component.scss']
})
export class ChamadoVisualizarComponent implements OnInit {

  entity: Demanda = new Demanda();

  constructor(
    private service: DemandaService,
    private route: ActivatedRoute,
    private router: Router
  ) {

  }
  ngOnInit() {
    this.init();
  }

  init(): void {
    this.service.getDemanda(this.route.snapshot.params.id)
      .subscribe((demanda: Demanda) => {
        this.entity = demanda;
      });
  }
}
