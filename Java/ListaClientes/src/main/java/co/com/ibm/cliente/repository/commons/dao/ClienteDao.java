package co.com.ibm.cliente.repository.commons.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.com.ibm.cliente.repository.commons.entities.IbmCliente;
import co.com.ibm.cliente.repository.shared.repository.IIbmClienteRepository;

@Repository
public class ClienteDao implements IClienteDao{

	@Autowired
	private IIbmClienteRepository ibmClienteRepository;
	
	private List<IbmCliente> ibmClientes = null;
	
	@Override
	public List<IbmCliente> listarClientes() throws Exception {
		// TODO Auto-generated method stub
		
		ibmClientes = ibmClienteRepository.findAll();
		
		return ibmClientes;
	}

	@Override
	public IbmCliente registrarCliente(IbmCliente ibmCliente) throws Exception {
		// TODO Auto-generated method stub
		
		ibmClienteRepository.saveAndFlush(ibmCliente);
		
		return null;
	}
	
	@Override
	public IbmCliente consultarCliente(Long clienteId) throws Exception {
		// TODO Auto-generated method stub
		
		IbmCliente ibmCliente;
		ibmCliente = ibmClienteRepository.findByClienteId(clienteId);
		
		return ibmCliente;
	}
}
