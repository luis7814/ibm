package co.com.ibm.asesor;

import java.util.ArrayList;
import java.util.List;

import co.com.ibm.asesor.repository.commons.entities.IbmAsesor;

public class TestCase {

	
	public List<IbmAsesor> datosPrueba(){
		
		List<IbmAsesor> ibmAsesors = new ArrayList<IbmAsesor>();
		IbmAsesor ibmAsesor;
		
		ibmAsesor = new IbmAsesor();
		ibmAsesor.setAsesorId(1L);
		ibmAsesor.setAsesorNombre("Asesor_1");
		ibmAsesor.setAsesorEspecialidad("Especialidad_1");
		ibmAsesors.add(ibmAsesor);
		
		ibmAsesor = new IbmAsesor();
		ibmAsesor.setAsesorId(2L);
		ibmAsesor.setAsesorNombre("Asesor_2");
		ibmAsesor.setAsesorEspecialidad("Especialidad_2");
		ibmAsesors.add(ibmAsesor);
		
		ibmAsesor = new IbmAsesor();
		ibmAsesor.setAsesorId(3L);
		ibmAsesor.setAsesorNombre("Asesor_3");
		ibmAsesor.setAsesorEspecialidad("Especialidad_3");
		ibmAsesors.add(ibmAsesor);
		
		return ibmAsesors;
		
	}
}
