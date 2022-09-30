import { RestService } from './../service/rest.service';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Component, OnInit } from '@angular/core';
import { EmployeeModel } from './employee-details.model';

@Component({
  selector: 'app-employee-details',
  templateUrl: './employee-details.component.html',
  styleUrls: ['./employee-details.component.css']
})
export class EmployeeDetailsComponent implements OnInit {

  showAdd!:boolean;
  showUpdate!:boolean;
  formValue!: FormGroup;
  employeeModelObj:EmployeeModel=new EmployeeModel();
  employeeData:any;


  constructor(private formbuilder:FormBuilder,private api:RestService) { }

  ngOnInit(): void {
    this.formValue=this.formbuilder.group({
      firstName:[''],
      lastName:[''],
      email:['']
    });
    this.getAllEmployee();
  }

  clickAdd()
  {
    this.formValue.reset();
    this.showAdd=true;
    this.showUpdate=false;
  }

  postEmployeeDetails()
  {
    this.employeeModelObj.firstName=this.formValue.value.firstName;
    this.employeeModelObj.lastName=this.formValue.value.lastName;
    this.employeeModelObj.email=this.formValue.value.email;

    this.api.postEmployee(this.employeeModelObj).subscribe(res=>{
      console.log(res);
      alert("Added successfully");
      let val=document.getElementById("cancel");
      val?.click();
      this.formValue.reset();
      this.getAllEmployee();
    },
    error=>{
      alert("Error happend");
    })
  }
  getAllEmployee()
  {
    this.api.getEmployee().subscribe(res=>
      {
        this.employeeData=res;
      })
  }
  deleteEmployee(row:any)
  {
    this.api.deleteEmployee(row.id).subscribe(res=>
      {
       alert("Deleted successfully");
       this.getAllEmployee();
      })
  }
 onEdit(row:any)
  {
    this.showAdd=false;
    this.showUpdate=true;
    this.employeeModelObj.id=row.id;
    this.formValue.controls['firstName'].setValue(row.firstName);
    this.formValue.controls['lastName'].setValue(row.lastName);
    this.formValue.controls['email'].setValue(row.email);
  }

  updateEmployeeDetails()
  {
    
    this.employeeModelObj.firstName=this.formValue.value.firstName;
    this.employeeModelObj.lastName=this.formValue.value.lastName;
    this.employeeModelObj.email=this.formValue.value.email;
    this.api.updateEmployee(this.employeeModelObj,this.employeeModelObj.id).subscribe(
      res=>{
         alert("Update done successfully");
         let val=document.getElementById("cancel");
        val?.click();
        this.formValue.reset();
        this.getAllEmployee();
      }
    )
  }
  
}
