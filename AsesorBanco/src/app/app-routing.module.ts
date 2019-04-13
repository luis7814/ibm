import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AsesorCreateComponent } from './registrar_asesor/registrar_asesor.component';
import { AsesorEditComponent } from './editar_asesor/editar_asesor.component';
import { AsesoresListComponent } from './listar_asesores/listar_asesores.component';

const routes: Routes = [
  { path: '', pathMatch: 'full', redirectTo: 'registrar_asesor' },
  { path: 'registrar_asesor', component: AsesorCreateComponent },
  { path: 'listar_asesores', component: AsesoresListComponent },
  { path: 'editar_asesor/:id', component: AsesorEditComponent }  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule { }