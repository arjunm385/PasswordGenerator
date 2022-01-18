import { HttpClient} from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class BackendCallService {

  constructor(private http:HttpClient) { }

  getPassword(password:any){
    return this.http.post(`http://localhost:8010/password/generate`,password)
  }

}
