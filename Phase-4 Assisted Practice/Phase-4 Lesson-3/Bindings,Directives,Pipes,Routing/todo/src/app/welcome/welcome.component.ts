import { WelcomeDataService } from './../service/data/welcome-data.service';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.css']
})
export class WelcomeComponent implements OnInit {

  name=''
  password=''
  welcomeMessageFromService: any;
  //Activated Route
  constructor(private route: ActivatedRoute,private welcomeDataService: WelcomeDataService) { }

  ngOnInit(): void {
    this.name=this.route.snapshot.params['name'];
    this.password=this.route.snapshot.params['password'];
  }

  getWelcomeMessage()
  {
    console.log(this.welcomeDataService.executeWelcomeObjectService());
    //console.log("get welcome message");
    this.welcomeDataService.executeWelcomeObjectService().subscribe(
      response =>this.handleSuccessfulResponse(response),
      error=>this.handleSuccessfulResponse(error)
     // response=>console.log(response)
    );
    console.log('last line of getWelcomeMessage');
  }
  getWelcomeMessageWithParameter()
  {
    console.log(this.welcomeDataService.executeWelcomeObjectService());
    //console.log("get welcome message");
    this.welcomeDataService.executeWelcomeObjectServiceWithPathVariable(this.name).subscribe(
      response =>this.handleSuccessfulResponse(response),
      error=>this.handleSuccessfulResponse(error)
     // response=>console.log(response)
    );
    console.log('last line of getWelcomeMessage');
  }
  handleSuccessfulResponse(response:any){
    this.welcomeMessageFromService=response.message;
   // console.log(response.message);
  }
  hanldeErrorReponse(error:any)
  {
    this.welcomeMessageFromService=error.error.message;
  }
}
