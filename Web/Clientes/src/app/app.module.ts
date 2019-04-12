import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';

// HttpClient module for RESTful API
import { HttpClientModule } from '@angular/common/http';

// Routing module for router service
import { AppRoutingModule } from './app-routing.module';

// Forms module
import { FormsModule } from '@angular/forms';

// Components
import { AsesorCreateComponent } from './crear_asesor/crear_asesor.component';
import { AsesorEditComponent } from './editar_asesor/editar_asesor.component';
import { AsesorsListComponent } from './listar_asesores/listar_asesores.component';

@NgModule({
  declarations: [
    AppComponent,
    AsesorCreateComponent,
    AsesorEditComponent,
    AsesorsListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})

export class AppModule { }