import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from "@angular/forms";
import { Router } from "@angular/router";
import { ApiService } from "../core/api.service";

@Component({
  selector: 'app-add-encuesta',
  templateUrl: './add-encuesta.component.html',
  styleUrls: ['./add-encuesta.component.css']
})
export class AddEncuestaComponent implements OnInit {

  constructor(private formBuilder: FormBuilder, private router: Router, private apiService: ApiService) { }

  addForm: FormGroup;

  ngOnInit() {
    this.addForm = this.formBuilder.group({
      id: [],
      nombres: ['', Validators.required],
      apellidos: ['', Validators.required],
      edad: ['', Validators.required],
      profesion: ['', Validators.required],
      lugartrabajo: ['', Validators.required],
      respuesta: ['', Validators.required]
    });
  }

  onSubmit() {
    this.apiService.createEncuesta(this.addForm.value)
      .subscribe(data => {
        this.router.navigate(['list-encuesta']);
      });
  }

}
