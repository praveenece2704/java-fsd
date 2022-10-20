import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-verify',
  templateUrl: './verify.component.html',
  styleUrls: ['./verify.component.css']
})
export class VerifyComponent implements OnInit {


  details:any;

  constructor(private http:HttpClient) { }

  ngOnInit(): void {
    let response= this.http.get("http://localhost:8080/showdetails")
    response.subscribe((data)=>this.details=data);
  }

}
