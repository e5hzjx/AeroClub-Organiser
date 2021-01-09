import { Component } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'acmsfrontend';
  data = [];
  constructor(private http: HttpClient) {
    /*
    this.http.get('http://176.63.148.61:8080/').subscribe(data => {
    this.data.push(data);
    console.log(this.data);
    }, error => console.error(error));
    */
  }
}
