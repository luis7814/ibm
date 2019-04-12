package co.com.ibm.historial.core.commons.entities;

public class Historial {
	
	private Long historialId;
	private String historialFechaConsumo;
	private String historialDescripcionConsumo;
	private Long historialMonto;
	
	public Long getHistorialId() {
		return historialId;
	}
	
	public void setHistorialId(Long historialId) {
		this.historialId = historialId;
	}
	
	public String getHistorialFechaConsumo() {
		return historialFechaConsumo;
	}
	
	public void setHistorialFechaConsumo(String historialFechaConsumo) {
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
