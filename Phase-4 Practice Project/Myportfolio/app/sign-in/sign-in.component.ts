
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HardcodedAuthenticationService } from '../service/hardcoded-authentication.service';

@Component({
  selector: 'app-sign-in',
  templateUrl: './sign-in.component.html',
  styleUrls: ['./sign-in.component.css']
})
export class SignInComponent implements OnInit {

  username ='praveen';
  password = '';
  errorMessage='Invalid Credentials';
  invalidLogin=false;

  constructor(private router: Router,private hardcodedAuthenticationService:HardcodedAuthenticationService) { }

  ngOnInit(): void {
  }
   
  checkcondition(){
  if(this.hardcodedAuthenticationService.authenticate(this.username,this.password))
  {
      this.router.navigate(['main-page',this.username]); 
      this.invalidLogin=false;
  }
  else
  {
    this.invalidLogin=true;
  }
}

}
