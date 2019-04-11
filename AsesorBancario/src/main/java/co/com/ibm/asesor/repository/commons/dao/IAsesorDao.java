package co.com.ibm.asesor.repository.commons.dao;

import java.util.List;

import co.com.ibm.asesor.repository.commons.entities.IbmAsesor;

public interface IAsesorDao {

	public List<IbmAsesor> listarAsesores() throws Exception;
	public IbmAsesor registrarAsesor(IbmAsesor ibmAsesor) throws Exception;
	public IbmAsesor consultarAsesor(Long asesorId) throws Exception;
	
	
}
