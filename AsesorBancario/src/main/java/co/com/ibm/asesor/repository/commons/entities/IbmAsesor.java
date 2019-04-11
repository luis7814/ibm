package co.com.ibm.asesor.repository.commons.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ibm_asesor")
public class IbmAsesor implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="asesor_id")
	private Long asesorId;
	
	@Column(name="asesor_nombre")
	private String asesorNombre;
	
	@Column(name="asesor_especialidad")
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
