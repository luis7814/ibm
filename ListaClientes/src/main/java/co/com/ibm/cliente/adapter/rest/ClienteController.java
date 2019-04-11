package co.com.ibm.cliente.adapter.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.ibm.cliente.core.commons.entities.Cliente;
import co.com.ibm.cliente.core.shared.services.IClienteService;

@RestController
public class ClienteController {

	@Autowired
	private IClienteService iClienteService;
	
	private List<Cliente> clientes;
	
	@GetMapping("/cliente")
	public ResponseEntity<List<Cliente>> listarClientes(){
		
		clientes = iClienteService.listarClientes();
		
		return new ResponseEntity<List<Cliente>>(clientes, HttpStatus.ACCEPTED);
	}
	
	
}
