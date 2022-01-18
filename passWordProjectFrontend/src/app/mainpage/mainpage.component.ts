import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-mainpage',
  templateUrl: './mainpage.component.html',
  styleUrls: ['./mainpage.component.css']
})
export class MainpageComponent implements OnInit {

  password={
    digit:'',
    specialChar:'',
    lowerCase:'',
    upperCase:''
  }
  value='';
  status=false;

  constructor() { }

  ngOnInit(): void {
  }

  onSubmit(){
    
  }

}
