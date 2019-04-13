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
import { AsesorCreateComponent } from './registrar_asesor/registrar_asesor.component';
import { AsesorEditComponent } from './editar_asesor/editar_asesor.component';
import { AsesoresListComponent } from './listar_asesores/listar_asesores.component';

@NgModule({
  declarations: [
    AppComponent,
    AsesorCreateComponent,
    AsesorEditComponent,
    AsesoresListComponent
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