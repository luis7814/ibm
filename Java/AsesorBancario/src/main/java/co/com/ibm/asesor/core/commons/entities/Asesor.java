package co.com.ibm.asesor.core.commons.entities;

import java.io.Serializable;

/*
 * @Clase : Asesor.java
 * @Comentario : Clase entidad que contiene la informacion de asesores
 * 
 */

public class Asesor implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private Long asesorId;
	private String asesorNombre;
	private String asesorEspecialidad;
	private String mensajeResultado;
	
	
	public Asesor() {
		// TODO Auto-generated constructor stub
	}
	
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

	public String getMensajeResultado() {
		return mensajeResultado;
	}

	public void setMensajeResultado(String mensajeResultado) {
		this.mensajeResultado = mensajeResultado;
	}
	
	
	

}
