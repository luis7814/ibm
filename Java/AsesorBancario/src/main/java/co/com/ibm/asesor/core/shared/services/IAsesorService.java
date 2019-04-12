package co.com.ibm.asesor.core.shared.services;

import java.util.List;

import co.com.ibm.asesor.core.commons.entities.Asesor;
import co.com.ibm.asesor.repository.commons.entities.IbmAsesor;

public interface IAsesorService {
	
	public List<Asesor> listarAsesores();
	public Asesor registrarAsesor(Asesor asesor);
	public Asesor consultarAsesor(String asesorId);

}
