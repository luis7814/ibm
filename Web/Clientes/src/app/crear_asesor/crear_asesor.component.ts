import { Component, OnInit, Input } from '@angular/core';
import { Router } from '@angular/router';
import { RestApiService } from "../shared/rest-api.service";

@Component({
  selector: 'app-crear_asesor',
  templateUrl: './crear_asesor.component.html',
  styleUrls: ['./crear_asesor.component.css']
})
export class AsesorCreateComponent implements OnInit {

  @Input() asesorDetails = { asesorNombre: '', asesorEspecialidad: '' }

  constructor(
    public restApi: RestApiService, 
    public router: Router
  ) { }

  ngOnInit() { }

  addAsesor(dataAsesor) {
    this.restApi.createAsesor(this.asesorDetails).subscribe((data: {}) => {
      this.router.navigate(['/listar_asesores'])
    })
  }

}