import { Component, OnInit } from '@angular/core';
import { RestApiService } from "../shared/rest-api.service";
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-editar_asesor',
  templateUrl: './editar_asesor.component.html',
  styleUrls: ['./editar_asesor.component.css']
})

export class AsesorEditComponent implements OnInit {
  asesorId = this.actRoute.snapshot.params['asesorId'];
  asesorData: any = {};

  constructor(
    public restApi: RestApiService,
    public actRoute: ActivatedRoute,
    public router: Router
  ) { 
  }

  ngOnInit() { 
    this.restApi.getAsesor(this.asesorId).subscribe((data: {}) => {
      this.asesorData = data;
    })
  }

  // Update asesor data
  updateAsesor() {
    if(window.confirm('Are you sure, you want to update?')){
      this.restApi.updateAsesor(this.asesorId, this.asesorData).subscribe(data => {
        this.router.navigate(['/editar_asesor'])
      })
    }
  }

}