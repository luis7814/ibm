package co.com.ibm.cliente.core.shared.services;

import java.util.List;

import co.com.ibm.cliente.core.commons.entities.Cliente;
import co.com.ibm.cliente.repository.commons.entities.IbmCliente;

public interface IClienteService {

	List<Cliente> listarClientes();
	void registrarCliente(Cliente ibmCliente);
	Cliente consultarCliente(String clienteId);
}
