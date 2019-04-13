package co.com.ibm.asesor.core.shared.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import co.com.ibm.asesor.core.commons.entities.Asesor;
import co.com.ibm.asesor.repository.commons.dao.IAsesorDao;
import co.com.ibm.asesor.repository.commons.entities.IbmAsesor;

/*
 * @Clase : AsesorService.java
 * @Comentario : Clase logica que valida y retorna la lista de asesores
 * 
 */

@Service
public class AsesorService implements IAsesorService{

	
	@Autowired
	private transient IAsesorDao iAsesorDao;
	
	private Asesor asesor;
	private IbmAsesor ibmAsesor;
	
	private List<Asesor> asesors;
	
	public AsesorService() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public List<Asesor> listarAsesores() {
		// TODO Auto-generated method stub
		
		ObjectMapper objectMapper = new ObjectMapper();
		List<IbmAsesor> ibmAsesors;
		
		
		try {
			
			asesors = new ArrayList<>();
			ibmAsesors = iAsesorDao.listarAsesores();
			
			if(ibmAsesors != null) {
				asesors = objectMapper.convertValue(ibmAsesors, new TypeReference<List<Asesor>>() {});
				
			}else {
				asesor = new Asesor();
				asesor.setMensajeResultado("Lista vacia!.");
				asesors.add(asesor);
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		return asesors;
	}

	@Override
	public Asesor registrarAsesor(Asesor asesor) {
		// TODO Auto-generated method stub
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {
			
			ibmAsesor = new IbmAsesor();
			ibmAsesor = objectMapper.convertValue(asesor, new TypeReference<IbmAsesor>() {});
			
			iAsesorDao.registrarAsesor(ibmAsesor);
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		return null;
	}

	@Override
	public Asesor consultarAsesor(String asesorId) {
		// TODO Auto-generated method stub
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {
			
			ibmAsesor = iAsesorDao.consultarAsesor(Long.parseLong(asesorId));
			
			if(ibmAsesor != null) {
			
				asesor = new Asesor();
				asesor = objectMapper.convertValue(ibmAsesor, new TypeReference<Asesor>() {});
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		return asesor;
	}

}
