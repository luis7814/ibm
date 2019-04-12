import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Asesor } from '../shared/asesor';
import { Observable, throwError } from 'rxjs';
import { retry, catchError } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})

export class RestApiService {
  
  // Define API
  apiURL = 'http://localhost:3000';

  constructor(private http: HttpClient) { }

  // Http Options
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  }  

  // HttpClient API get() method => Fetch asesor list
  getAsesors(): Observable<Asesor> {
    return this.http.get<Asesor>(this.apiURL + '/asesor')
    .pipe(
      retry(1),
      catchError(this.handleError)
    )
  }

  // HttpClient API get() method => Fetch asesor
  getAsesor(asesorId): Observable<Asesor> {
    return this.http.get<Asesor>(this.apiURL + '/asesor/' + asesorId)
    .pipe(
      retry(1),
      catchError(this.handleError)
    )
  }  

  // HttpClient API post() method => Create asesor
  createAsesor(asesor): Observable<Asesor> {
    return this.http.post<Asesor>(this.apiURL + '/asesor', JSON.stringify(asesor), this.httpOptions)
    .pipe(
      retry(1),
      catchError(this.handleError)
    )
  }  

  // HttpClient API put() method => Update asesor
  updateAsesor(asesorId, asesor): Observable<Asesor> {
    return this.http.put<Asesor>(this.apiURL + '/asesor/' + asesorId, JSON.stringify(asesor), this.httpOptions)
    .pipe(
      retry(1),
      catchError(this.handleError)
    )
  }

  // HttpClient API delete() method => Delete asesor
  deleteAsesor(asesorId){
    return this.http.delete<Asesor>(this.apiURL + '/asesor/' + asesorId, this.httpOptions)
    .pipe(
      retry(1),
      catchError(this.handleError)
    )
  }

  // Error handling 
  handleError(error) {
     let errorMessage = '';
     if(error.error instanceof ErrorEvent) {
       // Get client-side error
       errorMessage = error.error.message;
     } else {
       // Get server-side error
       errorMessage = `Error Code: ${error.status}\nMessage: ${error.message}`;
     }
     window.alert(errorMessage);
     return throwError(errorMessage);
  }

}