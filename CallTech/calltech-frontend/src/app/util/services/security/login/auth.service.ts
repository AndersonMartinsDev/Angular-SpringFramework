import { Injectable, Output } from '@angular/core';
import { Usuario } from 'src/app/util/commons/user';
import { BehaviorSubject, Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment.prod';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  auth_token = environment.auth_url;
  clientId = 'client';


  _currentSubject: BehaviorSubject<any>;
  currentUser: Observable<Usuario>;

  show: boolean = false;

  constructor(private _http: HttpClient) {
    this._currentSubject = new BehaviorSubject(JSON.parse(localStorage.getItem('currentUser')));
    this.currentUser = this._currentSubject.asObservable();
  }

  login(usuario: Usuario) {
    this.show = true;
    this.requestToken(usuario);
    return this._http.post('http://localhost:8080/oauth/token',usuario).pipe(
      map(user => {
          localStorage.setItem('currentUser',JSON.stringify(user));
          this._currentSubject.next(user);
          return user;
      })
    );
  }
  requestToken(usuario: Usuario){
    let params = new URLSearchParams();
    params.append('grant_type','password');
    params.append('client_id',this.clientId);
    params.append('client_secret','123');


    let headers = (
      {'Content-type':'application/x-www-form-urlencoded; charset=utf-8',
      'Accept':'*/*',
      'Accept-Encoding': 'gzip, deflate',
      'Accept-Language': 'en-US,en;q=0.9',
      'Access-Control-Request-Headers': 'authorization',
      'Access-Control-Request-Method':' POST',
      'Cache-Control': 'no-cache',
      'Connection': 'keep-alive',
      'Host': 'http://localhost:8080',
      'Origin': 'http://localhost:8080',
      'Pragma': 'no-cache',
     ' User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.139 Safari/537.36'
      });
    this._http.post(this.auth_token,params.toString(),{headers:headers}).subscribe(data => this.guardarToken(data),err=> alert('Invalid Credentials'));

  }
  guardarToken(data){
    console.log(data);
  }


  logout(){
    localStorage.removeItem('currentUser');
    this._currentSubject.next(null);
  }

  public get currentUserValue(): Usuario {
    return this._currentSubject.value;
  }

}
