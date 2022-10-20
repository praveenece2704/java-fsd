import { Register } from './../register';
import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

  // constructor() { }

  // ngOnInit(): void {
  // }

  register: Register=new Register("","","","","","","");
  message:any;
  constructor(private service:ServiceService) { }

  ngOnInit(): void {
  }

  public registerNow()
  {
     this.service.register(this.register).subscribe((data)=>this.message=data);
  }

}
