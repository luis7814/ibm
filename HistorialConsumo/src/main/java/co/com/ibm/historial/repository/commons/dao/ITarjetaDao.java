package co.com.ibm.historial.repository.commons.dao;

import co.com.ibm.historial.repository.commons.entities.IbmTarjeta;

public interface ITarjetaDao {

	public IbmTarjeta consultarTarjeta(Long tarjetaId) throws Exception;
	
}
