import { Injectable } from '@angular/core';
import { Usuario } from '../../commons/user';
import { RequestService } from '../request-component';

@Injectable({
  providedIn: 'root'
})
export class SecurityService {
  url = 'user';
  constructor(private service: RequestService) { }

  listarUsuarios() {
    return this.service.get<Usuario[]>(this.url);
  }

  inserir(model): void {
    this.service.post(this.url, model).toPromise();
  }

}
