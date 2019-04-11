package co.com.ibm.asesor.core.commons.entities;

import java.io.Serializable;

public class Asesor{
	
	
	private static final long serialVersionUID = 1L;
	private Long asesorId;
	private String asesorNombre;
	private String asesorEspecialidad;
	
	public Long getAsesorId() {
		return asesorId;
	}
	
	public void setAsesorId(Long asesorId) {
		this.asesorId = asesorId;
	}
	
	public String getAsesorNombre() {
		return asesorNombre;
	}
	
	public void setAsesorNombre(String asesorNombre) {
		this.asesorNombre = asesorNombre;
	}
	
	public String getAsesorEspecialidad() {
		return asesorEspecialidad;
	}
	
	public void setAsesorEspecialidad(String asesorEspecialidad) {
		this.asesorEspecialidad = asesorEspecialidad;
	}
	
	

}
