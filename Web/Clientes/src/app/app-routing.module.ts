import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AsesorCreateComponent } from './crear_asesor/crear_asesor.component';
import { AsesorEditComponent } from './editar_asesor/editar_asesor.component';
import { AsesorsListComponent } from './listar_asesores/listar_asesores.component';

const routes: Routes = [
  { path: '', pathMatch: 'full', redirectTo: 'crear_asesor' },
  { path: 'crear_asesor', component: AsesorCreateComponent },
  { path: 'listar_asesores', component: AsesorsListComponent },
  { path: 'editar_asesor/:asesorId', component: AsesorEditComponent }  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule { }