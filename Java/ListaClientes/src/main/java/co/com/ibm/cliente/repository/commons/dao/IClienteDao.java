package co.com.ibm.cliente.repository.commons.dao;

import java.util.List;

import co.com.ibm.cliente.repository.commons.entities.IbmCliente;

public interface IClienteDao {

	public List<IbmCliente> listarClientes() throws Exception;
	
}
