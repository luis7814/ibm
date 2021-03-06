package co.com.ibm.asesor.adapter.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.com.ibm.asesor.core.commons.entities.Asesor;
import co.com.ibm.asesor.core.shared.services.IAsesorService;

/*
 * @Clase : AsesorController.java
 * @Comentario : Clase Controller que expone los servicios de asesores
 * 
 */

@RestController
public class AsesorController {

	@Autowired
	private IAsesorService iAsesorService;
	
	public AsesorController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/asesores")
	public ResponseEntity<List<Asesor>> listarAsesores(){
		
		List<Asesor> asesors;
		asesors = iAsesorService.listarAsesores();
		
		return new ResponseEntity<List<Asesor>>(asesors, HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping("/asesor")
	public ResponseEntity<Asesor> consultarAsesor(@RequestParam("asesorId") String asesorId){
		
		Asesor asesor;
		asesor = iAsesorService.consultarAsesor(asesorId);
		
		return new ResponseEntity<Asesor>(asesor, HttpStatus.ACCEPTED);
		
	}
	
	@PostMapping("/asesor")
	public ResponseEntity<String> registrarAsesor(@RequestBody Asesor asesor){
		
		iAsesorService.registrarAsesor(asesor);
		
		return new ResponseEntity<String>("Ok", HttpStatus.ACCEPTED);
	}
	
}
