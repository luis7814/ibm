package co.com.ibm.historial.repository.shared.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.ibm.historial.repository.commons.entities.IbmHistorial;

public interface IIbmHistorialRepository extends JpaRepository<IbmHistorial, Long>{

	List<IbmHistorial> findByClienteIdAndTarjetaId(Long clienteId, Long tarjetaId);

}
