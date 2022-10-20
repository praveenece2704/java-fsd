import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegistrationComponent } from './registration/registration.component';
import { LoginComponent } from './login/login.component';
import { HomepageComponent } from './homepage/homepage.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { MainComponent } from './main/main.component';
import { ApplicationComponent } from './application/application.component';
import { UpdateComponent } from './update/update.component';
import { DuplicateComponent } from './duplicate/duplicate.component';
import { DeathComponent } from './death/death.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { AloginComponent } from './alogin/alogin.component';
import { VerifyComponent } from './verify/verify.component';
import { AdminupdateComponent } from './adminupdate/adminupdate.component';

@NgModule({
  declarations: [
    AppComponent,
    RegistrationComponent,
    LoginComponent,
    HomepageComponent,
    HeaderComponent,
    FooterComponent,
    MainComponent,
    ApplicationComponent,
    UpdateComponent,
    DuplicateComponent,
    DeathComponent,
    AdminloginComponent,
    AloginComponent,
    VerifyComponent,
    AdminupdateComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,  
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
