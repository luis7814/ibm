import { Component, OnInit } from '@angular/core';
import { RestApiService } from "../shared/rest-api.service";

@Component({
  selector: 'app-listar_asesores',
  templateUrl: './listar_asesores.component.html',
  styleUrls: ['./listar_asesores.component.css']
})
export class AsesorsListComponent implements OnInit {

  Asesor: any = [];

  constructor(
    public restApi: RestApiService
  ) { }

  ngOnInit() {
    this.loadAsesors()
  }

  // Get asesor list
  loadAsesors() {
    return this.restApi.getAsesors().subscribe((data: {}) => {
      this.Asesor = data;
    })
  }

  // Delete asesor
  deleteAsesor(asesorId) {
    if (window.confirm('Are you sure, you want to delete?')){
      this.restApi.deleteAsesor(asesorId).subscribe(data => {
        this.loadAsesors()
      })
    }
  }  

}