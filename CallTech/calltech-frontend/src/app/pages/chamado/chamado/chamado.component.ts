import { Component, OnInit } from '@angular/core';
import { Chamado } from './chamado';
import { ChamadoService } from './chamado.service';


@Component({
  selector: 'ngx-chamado',
  templateUrl: './chamado.component.html',
  styleUrls: ['./chamado.component.scss'],
  providers: [ ChamadoService ],
})

export class ChamadoComponent implements OnInit {
  chamados: Chamado[];
  constructor(private chamadoService: ChamadoService) { }
  ngOnInit() {
    this.getCall();
  }
  getCall(): void {
    this.chamadoService.getCallAll()
      .subscribe(chamados => (this.chamados = chamados));
  }

}
