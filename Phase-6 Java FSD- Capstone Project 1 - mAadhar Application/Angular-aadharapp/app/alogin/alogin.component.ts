import { Component, OnInit } from '@angular/core';
import { Admin } from '../admin';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-alogin',
  templateUrl: './alogin.component.html',
  styleUrls: ['./alogin.component.css']
})
export class AloginComponent implements OnInit {

  admin: Admin=new Admin("","");
  message:any;
  invalidLogin: boolean | undefined;


  constructor(private service:ServiceService) { }

  ngOnInit(): void {
    
  }

  public aloginNow()
  {
     this.service.alogin(this.admin).subscribe((data)=>this.message=data);
   
  }
}
