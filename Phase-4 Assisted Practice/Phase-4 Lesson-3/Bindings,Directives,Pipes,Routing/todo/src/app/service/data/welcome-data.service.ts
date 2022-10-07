import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
export class HelloWorld {
  constructor(public message:string){

  }}
@Injectable({
  providedIn: 'root'
})
export class WelcomeDataService {

  constructor(private httpClient:HttpClient) { }

  executeWelcomeObjectService()
  {
    return this.httpClient.get('http://localhost:8081/welcome-object');
  }
  
  executeWelcomeObjectServiceWithPathVariable(name:any)
  {
    return this.httpClient.get(`http://localhost:8081/welcome-object-param/${name}}`);
  }
}
