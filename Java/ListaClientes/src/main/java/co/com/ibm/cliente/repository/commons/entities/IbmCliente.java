package co.com.ibm.cliente.repository.commons.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ibm_cliente")
public class IbmCliente implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="cliente_id")
	private Long clienteId;
	
	@Column(name="cliente_nombre")
	private String clienteNombre;
	
	@Column(name="cliente_direccion")
	private String clienteDireccion;
	
	@Column(name="cliente_ciudad")
	private String clienteCiudad;
	
	@Column(name="cliente_telefono")
	private String clienteTelefono;
	
	public Long getClienteId() {
		return clienteId;
	}
	
	public void setClienteId(Long clienteId) {
		this.clienteId = clienteId;
	}
	
	public String getClienteNombre() {
		return clienteNombre;
	}
	
	public void setClienteNombre(String clienteNombre) {
		this.clienteNombre = clienteNombre;
	}
	
	public String getClienteDireccion() {
		return clienteDireccion;
	}
	
	public void setClienteDireccion(String clienteDireccion) {
		this.clienteDireccion = clienteDireccion;
	}
	
	public String getClienteCiudad() {
		return clienteCiudad;
	}
	
	public void setClienteCiudad(String clienteCiudad) {
		this.clienteCiudad = clienteCiudad;
	}
	
	public String getClienteTelefono() {
		return clienteTelefono;
	}
	
	public void setClienteTelefono(String clienteTelefono) {
		this.clienteTelefono = clienteTelefono;
	}
	
	

}
