package co.com.ibm.cliente.repository.shared.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.ibm.cliente.repository.commons.entities.IbmTarjeta;

public interface IIbmTarjetaRepository extends JpaRepository<IbmTarjeta, Long>{

	List<IbmTarjeta> findByClienteId(Long clienteId);

}
