import { Component, OnInit } from '@angular/core';
import { Router } from "@angular/router";
import { Encuesta } from "../model/encuesta.model";
import { ApiService } from "../core/api.service";

@Component({
  selector: 'app-list-encuesta',
  templateUrl: './list-encuesta.component.html',
  styleUrls: ['./list-encuesta.component.css']
})
export class ListEncuestaComponent implements OnInit {

  encuestas: Encuesta[];

  constructor(private router: Router, private apiService: ApiService) { }

  ngOnInit() {
    if (!window.localStorage.getItem('token')) {
      this.router.navigate(['login']);
      return;
    }
    this.apiService.getEncuestas()
      .subscribe(data => {
        this.encuestas = data.result;
      });
  }

  addEncuesta(): void {
    this.router.navigate(['add-encuesta']);
  }

}
