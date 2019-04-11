package co.com.ibm.historial.repository.commons.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.com.ibm.historial.repository.commons.entities.IbmHistorial;
import co.com.ibm.historial.repository.shared.repository.IIbmHistorialRepository;

@Repository
public class HistorialDao implements IHistorialDao {

	@Autowired
	private IIbmHistorialRepository ibmHistorialRepository;
	
	private List<IbmHistorial> ibmHistorials;
	
	@Override
	public List<IbmHistorial> consultarConsumoTarjeta(Long clienteId, Long tarjetaId) throws Exception {
		// TODO Auto-generated method stub
		
		ibmHistorials = ibmHistorialRepository.findByClienteIdAndTarjetaId(clienteId, tarjetaId);
		
		return ibmHistorials;
	}

}
