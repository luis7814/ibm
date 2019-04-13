package co.com.ibm.historial.core.commons.entities;

import java.util.List;

public class Tarjeta {

	private Long tarjetaId;
	private String tarjetaNumero;
	private String tarjetaCcv;
	private String tarjetaTipo;
	private List<Historial> historials;
	private String mensajeResultado;
	
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

	public List<Historial> getHistorials() {
		return historials;
	}

	public void setHistorials(List<Historial> historials) {
		this.historials = historials;
	}

	public String getMensajeResultado() {
		return mensajeResultado;
	}

	public void setMensajeResultado(String mensajeResultado) {
		this.mensajeResultado = mensajeResultado;
	}
	
	
}
