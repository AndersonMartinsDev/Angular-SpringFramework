import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';

import { Chamado } from './chamado';
import { Observable } from 'rxjs';


@Injectable()
export class ChamadoService {
  callUrl = 'http://localhost:8080/v1/chamado/';  // URL to web api
  constructor(private http: HttpClient ) {}

  getCallAll(): Observable<Chamado[]> {
    return this.http.get<Chamado[]>( this.callUrl);
  }
}

