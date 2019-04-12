package co.com.ibm.asesor.repository.shared.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.ibm.asesor.repository.commons.entities.IbmAsesor;

public interface IAsesorRepository extends JpaRepository<IbmAsesor, Long>{

	IbmAsesor findByAsesorId(Long asesorId);

}
