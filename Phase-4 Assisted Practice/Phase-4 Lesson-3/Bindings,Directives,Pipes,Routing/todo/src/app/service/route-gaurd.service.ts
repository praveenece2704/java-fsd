import { HardcodedAuthenticationService } from './hardcoded-authentication.service';
import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, Route, Router, RouterStateSnapshot } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class RouteGaurdService implements CanActivate {
 
  constructor(private hardcodeAuthenticate:HardcodedAuthenticationService,private router:Router) { }

  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot) {
   if(this.hardcodeAuthenticate.isLoggedIn())
   {
    return true;
   }
   else{
    this.router.navigate(['login']);
    return false;
   }
  }
}
