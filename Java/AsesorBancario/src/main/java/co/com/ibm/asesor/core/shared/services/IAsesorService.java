package co.com.ibm.asesor.core.shared.services;

import java.util.List;

import co.com.ibm.asesor.core.commons.entities.Asesor;

public interface IAsesorService {
	
	List<Asesor> listarAsesores();
	Asesor registrarAsesor(Asesor asesor);
	Asesor consultarAsesor(String asesorId);

}
