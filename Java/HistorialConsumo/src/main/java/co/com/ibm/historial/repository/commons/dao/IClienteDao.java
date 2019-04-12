package co.com.ibm.historial.repository.commons.dao;

import co.com.ibm.historial.repository.commons.entities.IbmCliente;

public interface IClienteDao {

	public IbmCliente consultarConsumoCliente(Long clienteId) throws Exception;
	
}
