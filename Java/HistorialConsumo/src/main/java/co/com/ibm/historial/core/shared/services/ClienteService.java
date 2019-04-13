package co.com.ibm.historial.core.shared.services;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.ibm.historial.core.commons.entities.Cliente;
import co.com.ibm.historial.core.commons.entities.Historial;
import co.com.ibm.historial.core.commons.entities.Tarjeta;
import co.com.ibm.historial.repository.commons.dao.IClienteDao;
import co.com.ibm.historial.repository.commons.dao.IHistorialDao;
import co.com.ibm.historial.repository.commons.dao.ITarjetaDao;
import co.com.ibm.historial.repository.commons.entities.IbmCliente;
import co.com.ibm.historial.repository.commons.entities.IbmHistorial;
import co.com.ibm.historial.repository.commons.entities.IbmTarjeta;

/*
 * @Clase : ClienteService.java
 * @Comentario : Clase Logica que consulta y valida la informacion de los clientes
 * 
 */

@Service
public class ClienteService implements IClienteService{

	@Autowired
	private IClienteDao iClienteDao;
	
	@Autowired
	private ITarjetaDao iTarjetaDao;
	
	@Autowired
	private IHistorialDao iHistorialDao;
	
	private List<IbmHistorial> ibmHistorials;
	
	private List<Historial> historials;
	private List<Tarjeta> tarjetas;
	
	private Cliente cliente;
	private Tarjeta tarjeta;
	private Historial historial;
	
	private IbmTarjeta ibmTarjeta;
	private IbmCliente ibmCliente;
	
	@Override
	public Cliente consultarConsumoCliente(String clienteId, String tarjetaId) {
		// TODO Auto-generated method stub
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			
			tarjetas = new ArrayList<>();
			
			ibmCliente = iClienteDao.consultarConsumoCliente(Long.parseLong(clienteId));
			
			if(ibmCliente != null) {
				
				cliente = new Cliente();	
				cliente.setClienteId(ibmCliente.getClienteId());
				cliente.setClienteNombre(ibmCliente.getClienteNombre());
				cliente.setClienteTelefono(ibmCliente.getClienteTelefono());
				cliente.setClienteCiudad(ibmCliente.getClienteCiudad());
				cliente.setClienteDireccion(ibmCliente.getClienteDireccion());
					
				ibmTarjeta = iTarjetaDao.consultarTarjeta(Long.parseLong(tarjetaId));
				
				if(ibmTarjeta != null) {
					
					tarjeta = new Tarjeta();
					tarjeta.setTarjetaId(ibmTarjeta.getTarjetaId());
					tarjeta.setTarjetaNumero(ibmTarjeta.getTarjetaNumero());
					tarjeta.setTarjetaCcv(ibmTarjeta.getTarjetaCcv());
					tarjeta.setTarjetaTipo(ibmTarjeta.getTarjetaTipo());
					
					ibmHistorials = iHistorialDao.consultarConsumoTarjeta(Long.parseLong(clienteId), Long.parseLong(tarjetaId));
					
					if(ibmHistorials != null && ibmHistorials.size() > 0) {
						
						historials = new ArrayList<>();
						for(int a = 0; a < ibmHistorials.size(); a++) {
							
							historial = new Historial();
							historial.setHistorialId(ibmHistorials.get(a).getHistorialId());
							historial.setHistorialDescripcionConsumo(ibmHistorials.get(a).getHistorialDescripcionConsumo());
							historial.setHistorialFechaConsumo(simpleDateFormat.format(ibmHistorials.get(a).getHistorialFechaConsumo()));
							historial.setHistorialMonto(ibmHistorials.get(a).getHistorialMonto());
							historials.add(historial);
							
						}
						
						tarjeta.setHistorials(historials);
						tarjetas.add(tarjeta);
					}
				}else{
					tarjeta = new Tarjeta();
					tarjeta.setMensajeResultado("El cliente no tiene tarjetas!.");
					tarjetas.add(tarjeta);
				}
			}else {
				cliente = new Cliente();
				cliente.setMensajeResultado("No existe el Cliente!.");
			}
			
			cliente.setTarjetas(tarjetas);
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return cliente;
	}

}
