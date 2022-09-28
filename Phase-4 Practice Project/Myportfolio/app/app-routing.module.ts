
import { ProjectsComponent } from './projects/projects.component';
import { SkillsComponent } from './skills/skills.component';
import { PersonalComponent } from './personal/personal.component';
import { SignInComponent } from './sign-in/sign-in.component';
import { MainPageComponent } from './main-page/main-page.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RouteGaurdService } from './service/route-gaurd.service';
import { LogoutComponent } from './logout/logout.component';

const routes: Routes = [
  {path:'',component:SignInComponent},
  {path:'main-page/:name',component:MainPageComponent,canActivate: [RouteGaurdService]},
  {path:'sign-in',component:SignInComponent},
  {path:'personal',component:PersonalComponent,canActivate: [RouteGaurdService]},
  {path:'skills',component:SkillsComponent,canActivate: [RouteGaurdService]},
  {path:'projects',component:ProjectsComponent,canActivate:[RouteGaurdService]},
  {path:'logout',component:LogoutComponent,canActivate:[RouteGaurdService]}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
