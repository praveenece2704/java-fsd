import { Death } from './death';
import { Register } from './register';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from './user';
import { Apply } from './apply';
import { Update } from './update';
import { Admin } from './admin';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  

  constructor(private http: HttpClient) { }

  register(register: Register)
    {
      return this.http.post("http://localhost:8080/register",register,{responseType:'text' as 'json'});
    }

    login(user: User)
    {
      return this.http.post("http://localhost:8080/login",user,{responseType:'text' as 'json'});
    }

    applydetails(details: Apply) {
      return this.http.post("http://localhost:8080/appdetails",details,{responseType:'text' as 'json'});
    }

    applyfordeath(details:Death)
    {
      return this.http.post("http://localhost:8080/deathUpdate",details,{responseType:'text' as 'json'})
    }

    updatedetails(details:Update)
    {
      return this.http.post("http://localhost:8080/updateAadhar",details,{responseType:'text' as 'json'})
    }

    getduplicate(email: any){
      return this.http.get("http://localhost:8080/viewStatus/"+email);
    }

    alogin(admin:Admin)
    {
      return this.http.post("http://localhost:8080/adminlogin",admin,{responseType:'text' as 'json'});
    }

    fetchDetails(email:any)
    {
      return this.http.get("http://localhost:8080/viewStatus/"+email);
    }
    
}
