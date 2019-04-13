package co.com.ibm.asesor.repository.commons.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.com.ibm.asesor.repository.commons.entities.IbmAsesor;
import co.com.ibm.asesor.repository.shared.repository.IAsesorRepository;

/*
 * @Clase : AsesorDao.java
 * @Comentario : Clase Dao que consulta la informacion de un asesor a la base de datos
 * 
 */

@Repository
public class AsesorDao implements IAsesorDao{

	
	@Autowired
	private IAsesorRepository iAsesorRepository;
	
	public AsesorDao() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public List<IbmAsesor> listarAsesores() throws Exception {
		// TODO Auto-generated method stub
		List<IbmAsesor> ibmAsesors;
		ibmAsesors = iAsesorRepository.findAll();
		
		return ibmAsesors;
	}

	@Override
	public IbmAsesor registrarAsesor(IbmAsesor ibmAsesor) throws Exception {
		// TODO Auto-generated method stub
		
		ibmAsesor = iAsesorRepository.saveAndFlush(ibmAsesor);
		
		return null;
	}

	@Override
	public IbmAsesor consultarAsesor(Long asesorId) throws Exception {
		// TODO Auto-generated method stub
		IbmAsesor ibmAsesor;
		ibmAsesor = iAsesorRepository.findByAsesorId(asesorId);
		
		return ibmAsesor;
	}

}
