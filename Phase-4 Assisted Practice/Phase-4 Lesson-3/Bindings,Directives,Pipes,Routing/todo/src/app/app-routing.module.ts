import { RouteGaurdService } from './service/route-gaurd.service';
import { LogoutComponent } from './logout/logout.component';
import { ListTodosComponent } from './list-todos/list-todos.component';
import { ErrorComponent } from './error/error.component';
import { LoginComponent } from './login/login.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {path:'',component:LoginComponent},
  {path: 'welcome/:name/:password', component: WelcomeComponent,canActivate: [RouteGaurdService]},
  {path: 'login', component: LoginComponent},
  {path:'todos',component:ListTodosComponent,canActivate: [RouteGaurdService]},
  {path: 'logout',component:LogoutComponent,canActivate: [RouteGaurdService]},
  {path: '**',component:ErrorComponent}//must be in the last
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
