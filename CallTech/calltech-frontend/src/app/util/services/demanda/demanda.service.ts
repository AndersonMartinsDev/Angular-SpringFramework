import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Demanda } from 'src/app/pages/chamado/demanda';
import { RequestService } from '../request-component';

@Injectable({
  providedIn: 'root'
})
export class DemandaService {

  constructor(private requestService: RequestService) { }

  listar() {
  }
}