package co.com.ibm.historial.repository.commons.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.com.ibm.historial.repository.commons.entities.IbmTarjeta;
import co.com.ibm.historial.repository.shared.repository.IIbmTarjetaRepository;

/*
 * @Clase : TarjetaDao.java
 * @Comentario : Clase Dao que consulta la informacion de la tarjeta de una persona en base de datos
 * 
 */

@Repository
public class TarjetaDao implements ITarjetaDao{

	
	@Autowired
	private IIbmTarjetaRepository ibmTarjetaRepository;
	
	private IbmTarjeta tarjeta;
	
	@Override
	public IbmTarjeta consultarTarjeta(Long tarjetaId) throws Exception {
		// TODO Auto-generated method stub
		
		tarjeta = ibmTarjetaRepository.findByTarjetaId(tarjetaId);
		
		return tarjeta;
	}

}
