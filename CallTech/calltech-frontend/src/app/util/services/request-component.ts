import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { environment } from 'src/environments/environment.prod';


@Injectable({
  providedIn: 'root'
})
export class RequestService {
  url = environment.base_url;

  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };

  constructor(private http: HttpClient) {
  }

  request<T>(apiUrl: string) {
    return this.http.get<T>(this.url + apiUrl);
  }
  response(apiUrl: string, T ) {
    return this.http.post(this.url + apiUrl, T);
  }

}
