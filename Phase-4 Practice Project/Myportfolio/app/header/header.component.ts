
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HardcodedAuthenticationService } from '../service/hardcoded-authentication.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  isLoggedIn=false;
  constructor(public hardcodedAuthenticationService:HardcodedAuthenticationService) { }

  ngOnInit(): void {
    this.isLoggedIn=this.hardcodedAuthenticationService.isLoggedIn();
  }

}
