package co.com.ibm.cliente.repository.commons.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.com.ibm.cliente.repository.commons.entities.IbmTarjeta;
import co.com.ibm.cliente.repository.shared.repository.IIbmTarjetaRepository;

@Repository
public class TarjetaDao implements ITarjetaDao{

	
	@Autowired
	private IIbmTarjetaRepository ibmTarjetaRepository;
	
	private List<IbmTarjeta> tarjetas;
	
	@Override
	public List<IbmTarjeta> listarTarjetaPorCliente(Long clienteId) throws Exception {
		// TODO Auto-generated method stub
		
		tarjetas = ibmTarjetaRepository.findByClienteId(clienteId);
		
		return tarjetas;
	}

}
