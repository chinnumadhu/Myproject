import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { StudentComponent } from './student/student.component';
import { RouterModule, Routes } from '@angular/router';
import { RegisterComponent } from './register/register.component';
import { LoginpageComponent } from './loginpage/loginpage.component';
import { PublishregisterComponent } from './publishregister/publishregister.component';
import { DemoprojectComponent } from './demoproject/demoproject.component';

const appRoutes: Routes = [
  { path : 'Register', component : RegisterComponent },
  { path : 'Home', component: HomeComponent },
  { path : 'Student', component: StudentComponent },
  { path : 'Loginpage', component: LoginpageComponent },
  { path : 'publishregister', component: PublishregisterComponent }];

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    StudentComponent,
    RegisterComponent,
    LoginpageComponent,
    PublishregisterComponent,
    DemoprojectComponent,
  ],
  imports: [
    BrowserModule , FormsModule, RouterModule.forRoot(appRoutes),
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
