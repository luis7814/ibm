package co.com.ibm.cliente.repository.commons.dao;

import java.util.List;

import co.com.ibm.cliente.repository.commons.entities.IbmCliente;

public interface IClienteDao {

	List<IbmCliente> listarClientes() throws Exception;
	IbmCliente registrarCliente(IbmCliente ibmCliente) throws Exception;
	IbmCliente consultarCliente(Long clienteId) throws Exception;
	
}
