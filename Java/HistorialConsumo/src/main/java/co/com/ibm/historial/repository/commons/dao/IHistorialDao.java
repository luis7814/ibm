package co.com.ibm.historial.repository.commons.dao;

import java.util.List;

import co.com.ibm.historial.repository.commons.entities.IbmHistorial;

public interface IHistorialDao {

	public List<IbmHistorial> consultarConsumoTarjeta(Long clienteId, Long tarjetaId) throws Exception;
}
