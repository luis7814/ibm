package co.com.ibm.cliente.repository.commons.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ibm_historial")
public class IbmHistorial implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="historial_id")
	private Long historialId;
	
	@Column(name="cliente_id")
	private Long clienteId;
	
	@Column(name="tarjeta_id")
	private Long tarjetaId;
	
	@Column(name="historial_fecha_consumo")
	private Date historialFechaConsumo;
	
	@Column(name="historial_descripcion_consumo")
	private String historialDescripcionConsumo;
	
	@Column(name="historial_monto")
	private Long historialMonto;

	
	public Long getHistorialId() {
		return historialId;
	}

	public void setHistorialId(Long historialId) {
		this.historialId = historialId;
	}

	public Long getClienteId() {
		return clienteId;
	}

	public void setClienteId(Long clienteId) {
		this.clienteId = clienteId;
	}

	public Long getTarjetaId() {
		return tarjetaId;
	}

	public void setTarjetaId(Long tarjetaId) {
		this.tarjetaId = tarjetaId;
	}

	public Date getHistorialFechaConsumo() {
		return historialFechaConsumo;
	}

	public void setHistorialFechaConsumo(Date historialFechaConsumo) {
		this.historialFechaConsumo = historialFechaConsumo;
	}

	public String getHistorialDescripcionConsumo() {
		return historialDescripcionConsumo;
	}

	public void setHistorialDescripcionConsumo(String historialDescripcionConsumo) {
		this.historialDescripcionConsumo = historialDescripcionConsumo;
	}

	public Long getHistorialMonto() {
		return historialMonto;
	}

	public void setHistorialMonto(Long historialMonto) {
		this.historialMonto = historialMonto;
	}
	
	
	
	
	
	
}


