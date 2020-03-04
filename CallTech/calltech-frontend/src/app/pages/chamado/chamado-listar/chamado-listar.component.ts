import { Component, OnInit, Injectable } from '@angular/core';
import { NzModalService } from 'ng-zorro-antd';
import { Chamado } from 'src/app/util/interface/chamado';
import { RequestService } from 'src/app/util/services/request-component';
import { DemandaService } from 'src/app/util/services/demanda/demanda.service';
import { Demanda } from '../demanda';
import { ActivatedRoute, Route, Router } from '@angular/router';

@Component({
  selector: 'app-chamado-listar',
  templateUrl: './chamado-listar.component.html',
  providers: [DemandaService],
})
export class ChamadoListarComponent {

  entity: Demanda;
  lista: Demanda[];
  /*--- MODAL -----*/
  isVisible = false;
  isVisibled = false;

  /*--- Tabela-------*/
  sortName: string | null = null;
  sortValue: string | null = null;
  searchAddress: string;

  constructor(private modalService: NzModalService,
    private service: DemandaService,
    private route: ActivatedRoute,
    private router: Router,
  ) {
    this.listar();
  }

  async listar() {
    await this.service.listar().subscribe((demandas: Demanda[]) => {
      this.lista = demandas;
    });
  }

}
