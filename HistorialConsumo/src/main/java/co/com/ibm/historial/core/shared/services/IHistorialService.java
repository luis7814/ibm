package co.com.ibm.historial.core.shared.services;

import java.util.List;

import co.com.ibm.historial.core.commons.entities.Historial;

public interface IHistorialService {

	public List<Historial> consultarConsumoTarjeta(Long clienteId, Long tarjetaId);
	
}
