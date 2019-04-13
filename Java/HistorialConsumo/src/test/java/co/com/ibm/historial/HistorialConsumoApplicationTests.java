package co.com.ibm.historial;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import co.com.ibm.historial.core.shared.services.ClienteService;
import co.com.ibm.historial.repository.commons.dao.IClienteDao;
import co.com.ibm.historial.repository.commons.dao.IHistorialDao;
import co.com.ibm.historial.repository.commons.dao.ITarjetaDao;
import co.com.ibm.historial.repository.commons.entities.IbmCliente;
import co.com.ibm.historial.repository.commons.entities.IbmHistorial;
import co.com.ibm.historial.repository.commons.entities.IbmTarjeta;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class HistorialConsumoApplicationTests {

	@InjectMocks
	private ClienteService clienteService;
	
	@Mock
	private IClienteDao iClienteDao;
	
	@Mock
	private ITarjetaDao iTarjetaDao;
	
	@Mock
	private IHistorialDao iHistorialDao;
	
	@Test
	public void contextLoads() {
		
		TestCase testCase = new TestCase();
		IbmCliente ibmCliente;
		IbmTarjeta ibmTarjeta;
		List<IbmHistorial> ibmHistorials; 
		
		
		try {
			
			for(int a = 0; a < 3; a++) {
				
				if(a == 0) {
					
					ibmCliente = testCase.datosCliente();
					when(iClienteDao.consultarConsumoCliente(1L)).thenReturn(ibmCliente);
					
					ibmTarjeta = testCase.datosTarjeta();
					when(iTarjetaDao.consultarTarjeta(1L)).thenReturn(ibmTarjeta);
					
					ibmHistorials = testCase.datosHistorial();
					when(iHistorialDao.consultarConsumoTarjeta(1L, 1L)).thenReturn(ibmHistorials);
					
					assertNotNull(clienteService.consultarConsumoCliente("1", "1"));
					
				}
				
				if(a == 1) {
					
					ibmCliente = null;
					when(iClienteDao.consultarConsumoCliente(1L)).thenReturn(ibmCliente);
					
					ibmTarjeta = testCase.datosTarjeta();
					when(iTarjetaDao.consultarTarjeta(1L)).thenReturn(ibmTarjeta);
					
					ibmHistorials = testCase.datosHistorial();
					when(iHistorialDao.consultarConsumoTarjeta(1L, 1L)).thenReturn(ibmHistorials);
					
					assertEquals("No existe el Cliente!.", clienteService.consultarConsumoCliente("1", "1").getMensajeResultado());
					
				}
				
				if(a == 2) {
					
					ibmCliente = testCase.datosCliente();
					when(iClienteDao.consultarConsumoCliente(1L)).thenReturn(ibmCliente);
					
					ibmTarjeta = null;
					when(iTarjetaDao.consultarTarjeta(1L)).thenReturn(ibmTarjeta);
					
					ibmHistorials = testCase.datosHistorial();
					when(iHistorialDao.consultarConsumoTarjeta(1L, 1L)).thenReturn(ibmHistorials);
					
					assertEquals("El cliente no tiene tarjetas!.", clienteService.consultarConsumoCliente("1", "1").getTarjetas().get(0).getMensajeResultado());
					
				}
				
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

}
