package co.com.ibm.historial.repository.shared.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.ibm.historial.repository.commons.entities.IbmCliente;

public interface IIbmClienteRepository extends JpaRepository<IbmCliente, Long>{
	
	public IbmCliente findByClienteId(Long clienteId);

}
