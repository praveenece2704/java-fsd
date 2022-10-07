import { HardcodedAuthenticationService } from './../service/hardcoded-authentication.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {

  isLoggedIn:boolean=false;
  constructor(public hardcodedAuthentication:HardcodedAuthenticationService) { }

  ngOnInit(): void {
    this.isLoggedIn=this.hardcodedAuthentication.isLoggedIn();
  }

}
