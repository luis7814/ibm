package co.com.ibm.cliente.adapter.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.com.ibm.cliente.core.commons.entities.Cliente;
import co.com.ibm.cliente.core.shared.services.IClienteService;

@RestController
public class ClienteController {

	@Autowired
	private IClienteService iClienteService;
	
	private List<Cliente> clientes;
	
	@GetMapping("/clientes")
	public ResponseEntity<List<Cliente>> listarClientes(){
		
		clientes = iClienteService.listarClientes();
		
		return new ResponseEntity<List<Cliente>>(clientes, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/cliente")
	public ResponseEntity<Cliente> consultarClientes(@RequestParam("clienteId") String clienteId){
		
		Cliente cliente;
		
		cliente = iClienteService.consultarCliente(clienteId);
		
		return new ResponseEntity<Cliente>(cliente, HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/cliente")
	public ResponseEntity<String> registrarCliente(@RequestBody Cliente cliente){
		
		iClienteService.registrarCliente(cliente);
		
		return new ResponseEntity<String>("Ok", HttpStatus.ACCEPTED);
		
	}
	
}
