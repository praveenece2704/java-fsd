import { DeathComponent } from './death/death.component';
import { ApplicationComponent } from './application/application.component';
import { HomepageComponent } from './homepage/homepage.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RegistrationComponent } from './registration/registration.component';
import { LoginComponent } from './login/login.component';
import { LogoutComponent } from './logout/logout.component';
import { MainComponent } from './main/main.component';
import { UpdateComponent } from './update/update.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { AloginComponent } from './alogin/alogin.component';
import { DuplicateComponent } from './duplicate/duplicate.component';
import { VerifyComponent } from './verify/verify.component';
import { AdminupdateComponent } from './adminupdate/adminupdate.component';

const routes: Routes = [
  {path:"",component:HomepageComponent},
  {path:"login",component:LoginComponent},
  {path:"register",component:RegistrationComponent},
  {path:"logout",component:LogoutComponent},
  {path:"main",component:MainComponent},
  {path:"apply",component:ApplicationComponent},
  {path:"death",component:DeathComponent},
  {path:"update",component:UpdateComponent},
  {path:"adminlogin",component:AdminloginComponent},
  {path:"admin",component:AloginComponent},
  {path:"duplicate",component:DuplicateComponent},
  {path:"verify",component:VerifyComponent},
  {path:"adminupdate",component:AdminupdateComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
