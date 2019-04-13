import { Component, OnInit, Input } from '@angular/core';
import { Router } from '@angular/router';
import { RestApiService } from "../shared/rest-api.service";

@Component({
  selector: 'app-registrar_asesor',
  templateUrl: './registrar_asesor.component.html',
  styleUrls: ['./registrar_asesor.component.css']
})
export class AsesorCreateComponent implements OnInit {

  @Input() asesorDetails = { name: '', email: '', phone: 0 }

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