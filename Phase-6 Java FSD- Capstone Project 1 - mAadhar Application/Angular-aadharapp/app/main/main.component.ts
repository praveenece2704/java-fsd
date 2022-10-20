import { Admin } from './../admin';
import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../service.service';
import { Apply } from '../apply';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.css']
})
export class MainComponent implements OnInit {
 
  details:any;

  constructor(private http:HttpClient) { }

  ngOnInit(): void {
    let response= this.http.get("http://localhost:8080/showdetails")
    response.subscribe((data)=>this.details=data);
  }

}
