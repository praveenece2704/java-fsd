import { Component, OnInit } from '@angular/core';
import { Apply } from '../apply';
import { ServiceService } from '../service.service';
import { Update } from '../update';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit {

  details: Update=new Update("","","","",0,"","",0,"","",0,0);
  message:any;
  constructor(private service:ServiceService) { }

  ngOnInit(): void {
  }

  public updateNow()
  {
     this.service.updatedetails(this.details).subscribe((data)=>this.message=data);
  }

}
