import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-duplicate',
  templateUrl: './duplicate.component.html',
  styleUrls: ['./duplicate.component.css']
})
export class DuplicateComponent implements OnInit {

  details:any;

  constructor(private http:HttpClient) { }

  ngOnInit(): void {
    let response= this.http.get("http://localhost:8080/showdetails")
    response.subscribe((data)=>this.details=data);
  }

}
