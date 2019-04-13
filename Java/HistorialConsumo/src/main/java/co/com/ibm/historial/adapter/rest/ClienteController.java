package co.com.ibm.historial.adapter.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.com.ibm.historial.core.commons.entities.Cliente;
import co.com.ibm.historial.core.shared.services.IClienteService;

/*
 * @Clase : ClienteController.java
 * @Comentario : Clase Controller que expone los servicios de los clientes
 * 
 */

@RestController
public class ClienteController {
	
	@Autowired
	private IClienteService iClienteService;
	
	private Cliente cliente;
	
	@GetMapping("/cliente")
	public ResponseEntity<Cliente> consultarConsumoCliente(@RequestParam("clienteId") String clienteId, @RequestParam("tarjetaId") String tarjetaId){
		
		cliente = iClienteService.consultarConsumoCliente(clienteId, tarjetaId);
		
		return new ResponseEntity<Cliente>(cliente, HttpStatus.ACCEPTED);
		
	}
	

}
