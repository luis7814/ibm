package co.com.ibm.historial.repository.shared.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.ibm.historial.repository.commons.entities.IbmTarjeta;

public interface IIbmTarjetaRepository extends JpaRepository<IbmTarjeta, Long>{

	IbmTarjeta findByTarjetaId(Long tarjetaId);

}
