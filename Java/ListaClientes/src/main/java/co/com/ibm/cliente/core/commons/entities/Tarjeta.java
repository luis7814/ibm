package co.com.ibm.cliente.core.commons.entities;

public class Tarjeta {

	private Long tarjetaId;
	private String tarjetaNumero;
	private String tarjetaCcv;
	private String tarjetaTipo;
	
	public Long getTarjetaId() {
		return tarjetaId;
	}
	
	public void setTarjetaId(Long tarjetaId) {
		this.tarjetaId = tarjetaId;
	}
	
	public String getTarjetaNumero() {
		return tarjetaNumero;
	}
	
	public void setTarjetaNumero(String tarjetaNumero) {
		this.tarjetaNumero = tarjetaNumero;
	}
	
	public String getTarjetaCcv() {
		return tarjetaCcv;
	}
	
	public void setTarjetaCcv(String tarjetaCcv) {
		this.tarjetaCcv = tarjetaCcv;
	}
	
	public String getTarjetaTipo() {
		return tarjetaTipo;
	}
	
	public void setTarjetaTipo(String tarjetaTipo) {
		this.tarjetaTipo = tarjetaTipo;
	}
	
	
}
