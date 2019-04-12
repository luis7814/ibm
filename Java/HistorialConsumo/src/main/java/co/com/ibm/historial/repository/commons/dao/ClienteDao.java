package co.com.ibm.historial.repository.commons.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.com.ibm.historial.repository.commons.entities.IbmCliente;
import co.com.ibm.historial.repository.shared.repository.IIbmClienteRepository;

@Repository
public class ClienteDao implements IClienteDao{

	@Autowired
	private IIbmClienteRepository ibmClienteRepository;
	
	private IbmCliente ibmCliente;
	
	@Override
	public IbmCliente consultarConsumoCliente(Long clienteId) throws Exception {
		// TODO Auto-generated method stub
		
		ibmCliente = ibmClienteRepository.findByClienteId(clienteId);
		
		return ibmCliente;
	}

}
