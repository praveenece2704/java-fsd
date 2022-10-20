import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../service.service';
import { Verifydone } from '../verifydone';

@Component({
  selector: 'app-adminupdate',
  templateUrl: './adminupdate.component.html',
  styleUrls: ['./adminupdate.component.css']
})
export class AdminupdateComponent implements OnInit {

  details: Verifydone=new Verifydone("","","","",0,"","",0,"","",0,0,"","","");
  message:any;
  constructor(private service:ServiceService) { }

  ngOnInit(): void {
  }

  public updateNow()
  {
     this.service.updatedetails(this.details).subscribe((data)=>this.message=data);
  }
}
