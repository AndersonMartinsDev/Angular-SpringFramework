import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Demanda } from 'src/app/pages/chamado/demanda';
import { RequestService } from '../request-component';

@Injectable({
  providedIn: 'root'
})
export class DemandaService {

  url = 'demandas';

  constructor(private http: RequestService) { }

  listar() {
    return this.http.get<Demanda[]>(this.url);
  }
  getDemanda(id: number) {
    return this.http.get<Demanda>(this.url + '/' + id);
  }
  salvar(model) {
    this.http.post(this.url, model);
  }
}
