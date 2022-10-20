import { Component, OnInit } from '@angular/core';
import { Death } from '../death';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-death',
  templateUrl: './death.component.html',
  styleUrls: ['./death.component.css']
})
export class DeathComponent implements OnInit {

  details: Death=new Death("","","");
  message:any;
  constructor(private service:ServiceService) { }

  ngOnInit(): void {
  }

  public cancelNow()
  {
     this.service.applyfordeath(this.details).subscribe((data)=>this.message=data);
  }


}
