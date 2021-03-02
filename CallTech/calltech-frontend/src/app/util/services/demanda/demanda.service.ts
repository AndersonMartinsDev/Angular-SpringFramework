import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Demanda } from 'src/app/pages/chamado/demanda';
import { RequestService } from '../request-component';
import { Observable } from 'rxjs';
import { delay } from 'q';

@Injectable({
  providedIn: 'root'
})
export class DemandaService {

  url = 'demandas';

  constructor(private http: RequestService) { }

  listar(): Observable<Demanda[]> {
    return this.http.get<Demanda[]>(this.url)
    .pipe();
  }
  getDemanda(id: number): Observable<Demanda> {
    return this.http.get<Demanda>(this.url + '/' + id);
  }
  salvar(model: Demanda): void {
    this.http.post(this.url, model).toPromise();
  }
}
