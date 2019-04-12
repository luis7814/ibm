package co.com.ibm.historial.core.commons.entities;

import java.util.List;

public class Cliente {
	
	private Long clienteId;
	private String clienteNombre;
	private String clienteDireccion;
	private String clienteCiudad;
	private String clienteTelefono;
	private String cantidadTarjetas;
	private List<Tarjeta> tarjetas;
	
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
	
	public String getCantidadTarjetas() {
		return cantidadTarjetas;
	}
	
	public void setCantidadTarjetas(String cantidadTarjetas) {
		this.cantidadTarjetas = cantidadTarjetas;
	}
	
	public List<Tarjeta> getTarjetas() {
		return tarjetas;
	}
	
	public void setTarjetas(List<Tarjeta> tarjetas) {
		this.tarjetas = tarjetas;
	}
	
	

}
