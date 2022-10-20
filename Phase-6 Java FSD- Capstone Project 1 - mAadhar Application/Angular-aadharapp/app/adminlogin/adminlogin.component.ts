import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-adminlogin',
  templateUrl: './adminlogin.component.html',
  styleUrls: ['./adminlogin.component.css']
})
export class AdminloginComponent implements OnInit {

  details:any;

  constructor(private http:HttpClient) { }

  ngOnInit(): void {
    let response= this.http.get("http://localhost:8080/showdetails")
    response.subscribe((data)=>this.details=data);
  }



}
