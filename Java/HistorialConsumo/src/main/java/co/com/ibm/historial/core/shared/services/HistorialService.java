package co.com.ibm.historial.core.shared.services;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.ibm.historial.core.commons.entities.Historial;
import co.com.ibm.historial.repository.commons.dao.IHistorialDao;
import co.com.ibm.historial.repository.commons.entities.IbmHistorial;

/*
 * @Clase : HistorialService.java
 * @Comentario : Clase Logica que consulta y valida la informacion del historial de clientes
 * 
 */

@Service
public class HistorialService implements IHistorialService{

	
	@Autowired
	private IHistorialDao iHistorialDao;
	
	private Historial historial;
	
	private List<Historial> historials;
	private List<IbmHistorial> ibmHistorials;
	
	
	@Override
	public List<Historial> consultarConsumoTarjeta(Long clienteId, Long tarjetaId) {
		// TODO Auto-generated method stub
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			
			ibmHistorials = iHistorialDao.consultarConsumoTarjeta(clienteId, tarjetaId);
			
			if(ibmHistorials != null && ibmHistorials.size() > 0) {
				
				historials = new ArrayList<Historial>();
				
				for(int a = 0; a < ibmHistorials.size(); a++) {
					
					historial = new Historial();
					historial.setHistorialId(ibmHistorials.get(a).getClienteId());
					historial.setHistorialFechaConsumo(simpleDateFormat.format(ibmHistorials.get(a).getHistorialFechaConsumo()));
					historial.setHistorialDescripcionConsumo(ibmHistorials.get(a).getHistorialDescripcionConsumo());
					historial.setHistorialMonto(ibmHistorials.get(a).getHistorialMonto());
					historials.add(historial);
					
				}
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return historials;
	}

}
