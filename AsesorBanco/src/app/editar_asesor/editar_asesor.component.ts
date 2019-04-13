import { Component, OnInit } from '@angular/core';
import { RestApiService } from "../shared/rest-api.service";
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-asesor-details',
  templateUrl: './editar_asesor.component.html',
  styleUrls: ['./editar_asesor.component.css']
})

export class AsesorEditComponent implements OnInit {
  id = this.actRoute.snapshot.params['id'];
  asesorData: any = {};

  constructor(
    public restApi: RestApiService,
    public actRoute: ActivatedRoute,
    public router: Router
  ) { 
  }

  ngOnInit() { 
    this.restApi.getAsesor(this.id).subscribe((data: {}) => {
      this.asesorData = data;
    })
  }

  // Update asesor data
  updateAsesor() {
    if(window.confirm('Are you sure, you want to update?')){
      this.restApi.updateAsesor(this.id, this.asesorData).subscribe(data => {
        this.router.navigate(['/listar_asesores'])
      })
    }
  }

}