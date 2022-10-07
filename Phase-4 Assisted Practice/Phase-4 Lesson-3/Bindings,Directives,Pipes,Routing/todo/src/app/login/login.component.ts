import { HardcodedAuthenticationService } from './../service/hardcoded-authentication.service';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  username ='praveen';
  password = '';
  errorMessage='Invalid Credentials';
  invalidLogin=false;

  //Router
  //Angular .giveMeRouter() //old way
  //Dependency Injection    //new way

  constructor(private router: Router,
    private hardcode:HardcodedAuthenticationService ) { }

  ngOnInit(): void {
  }

  handleLogin()
  {
     //console.log("Handle Login");
     //console.log(this.username);//to get input from the browser use two way binding
    //console.log(this.password);

    //if(this.username === 'praveen' && this.password==='12345')
    if(this.hardcode.authenticate(this.username,this.password))
    {
      //Redirect to welcome page
      this.router.navigate(['welcome',this.username,this.password]);
      this.invalidLogin=false;
    }
    else
    {
      this.invalidLogin=true;
    }
    }


}
