import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from '../service.service';
import { User } from '../user';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  user: User=new User("","","");
  message:any;
  invalidLogin: boolean | undefined;


  constructor(private service:ServiceService,private router: Router) { }

  ngOnInit(): void {
    
  }

  public loginNow()
  {
     this.service.login(this.user).subscribe((data)=>this.message=data);
   
  }
}


