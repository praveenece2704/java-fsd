import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class HardcodedAuthenticationService {

  constructor() { }

  authenticate(username:string,password:string)
  {
    if(username==='praveen' && password ==='12345')
    {
      sessionStorage.setItem('authenticateUser',username);
      //console.log('after',this.isLoggedIn());
      return true;
    }
      return false;
  }

  isLoggedIn()
  {
    let user =sessionStorage.getItem('authenticateUser');
    return !(user==null);
  }

  logout()
  {
    sessionStorage.removeItem('authenticateUser');
  }
}
