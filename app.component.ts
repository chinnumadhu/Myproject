
import { Component } from '@angular/core';
import { RegisterComponent } from 'build/classes/app/register/register.component';
import { PublishregisterComponent} from 'build/classes/app/publishregister/publishregister.component';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  count = 0;
  title = 'hello';
  appTitle: String = 'Welcome';
  appStatus: boolean = true;
  appList: any[] = [{
    "ID": "1",
    "Name": "one"
  },
  {
    "ID": "2",
    "Name": "Two"
  }

  ];

  increaseCount() {

    this.count++;
  }

}