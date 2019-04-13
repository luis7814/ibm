package co.com.ibm.historial;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import co.com.ibm.historial.repository.commons.entities.IbmCliente;
import co.com.ibm.historial.repository.commons.entities.IbmHistorial;
import co.com.ibm.historial.repository.commons.entities.IbmTarjeta;

public class TestCase {
	
	public IbmCliente datosCliente() {
		
		IbmCliente ibmCliente = new IbmCliente();
		
		ibmCliente.setClienteCiudad("Ciudad_1");
		ibmCliente.setClienteDireccion("Direccion_1");
		ibmCliente.setClienteId(1L);
		ibmCliente.setClienteNombre("Nombre_1");
		ibmCliente.setClienteTelefono("123 456");
		
		return ibmCliente;
		
	}
	
	public IbmTarjeta datosTarjeta() {
		
		IbmTarjeta ibmTarjeta = new IbmTarjeta();
		
		ibmTarjeta.setClienteId(1L);
		ibmTarjeta.setTarjetaCcv("123");
		ibmTarjeta.setTarjetaId(1L);
		ibmTarjeta.setTarjetaNumero("123 123 123 123");
		ibmTarjeta.setTarjetaTipo("123");
		
		return ibmTarjeta;
		
	}
	
	public List<IbmHistorial> datosHistorial(){
		
		IbmHistorial ibmHistorial;
		List<IbmHistorial> ibmHistorials = new ArrayList<>();
		
		ibmHistorial = new IbmHistorial();
		ibmHistorial.setClienteId(1L);
		ibmHistorial.setHistorialDescripcionConsumo("Descripcion");
		ibmHistorial.setHistorialFechaConsumo(new Date());
		ibmHistorial.setHistorialId(1L);
		ibmHistorial.setHistorialMonto(12L);
		ibmHistorial.setTarjetaId(2L);
		ibmHistorials.add(ibmHistorial);
		
		ibmHistorial = new IbmHistorial();
		ibmHistorial.setClienteId(1L);
		ibmHistorial.setHistorialDescripcionConsumo("Descripcion:1");
		ibmHistorial.setHistorialFechaConsumo(new Date());
		ibmHistorial.setHistorialId(2L);
		ibmHistorial.setHistorialMonto(12312L);
		ibmHistorial.setTarjetaId(2L);
		ibmHistorials.add(ibmHistorial);
		
		return ibmHistorials;
	}

}
