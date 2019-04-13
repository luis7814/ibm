import { Component, OnInit } from '@angular/core';
import { RestApiService } from "../shared/rest-api.service";

@Component({
  selector: 'app-listar_asesores',
  templateUrl: './listar_asesores.component.html',
  styleUrls: ['./listar_asesores.component.css']
})
export class AsesoresListComponent implements OnInit {

  Asesor: any = [];

  constructor(
    public restApi: RestApiService
  ) { }

  ngOnInit() {
    this.loadAsesores()
  }

  // Get asesores list
  loadAsesores() {
    return this.restApi.getAsesores().subscribe((data: {}) => {
      this.Asesor = data;
    })
  }

  // Delete asesor
  deleteAsesor(id) {
    if (window.confirm('Are you sure, you want to delete?')){
      this.restApi.deleteAsesor(id).subscribe(data => {
        this.loadAsesores()
      })
    }
  }  

}