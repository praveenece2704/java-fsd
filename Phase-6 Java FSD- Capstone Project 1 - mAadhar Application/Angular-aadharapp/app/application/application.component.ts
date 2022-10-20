import { Component, OnInit } from '@angular/core';
import { Apply } from '../apply';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-application',
  templateUrl: './application.component.html',
  styleUrls: ['./application.component.css']
})
export class ApplicationComponent implements OnInit {

  details: Apply=new Apply("","","","",0,"","",0,"","");
  message:any;
  constructor(private service:ServiceService) { }

  ngOnInit(): void {
  }

  public applyNow()
  {
     this.service.applydetails(this.details).subscribe((data)=>this.message=data);
  }


}
