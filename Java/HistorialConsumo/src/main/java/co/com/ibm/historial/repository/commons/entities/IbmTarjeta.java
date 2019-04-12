package co.com.ibm.historial.repository.commons.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ibm_tarjeta")
public class IbmTarjeta implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="tarjeta_id")
	private Long tarjetaId;
	
	@Column(name="cliente_id")
	private Long clienteId;
	
	@Column(name="tarjeta_numero")
	private String tarjetaNumero;
	
	@Column(name="tarjeta_ccv")
	private String tarjetaCcv;
	
	@Column(name="tarjeta_tipo")
	private String tarjetaTipo;

	
	public Long getTarjetaId() {
		return tarjetaId;
	}

	public void setTarjetaId(Long tarjetaId) {
		this.tarjetaId = tarjetaId;
	}

	public Long getClienteId() {
		return clienteId;
	}

	public void setClienteId(Long clienteId) {
		this.clienteId = clienteId;
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

