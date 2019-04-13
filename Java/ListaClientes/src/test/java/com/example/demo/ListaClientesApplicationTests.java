package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import co.com.ibm.cliente.core.shared.services.ClienteService;
import co.com.ibm.cliente.repository.commons.dao.IClienteDao;
import co.com.ibm.cliente.repository.commons.dao.ITarjetaDao;
import co.com.ibm.cliente.repository.commons.entities.IbmCliente;
import co.com.ibm.cliente.repository.commons.entities.IbmTarjeta;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ListaClientesApplicationTests {

	
	@InjectMocks
	private ClienteService clienteService;
	
	@Mock
	private IClienteDao iClienteDao;
	
	@Mock
	private ITarjetaDao iTarjetaDao;
	
	private TestCase testCase;
	
	@Test
	public void contextLoads() {
		
		List<IbmCliente> ibmClientes = new ArrayList<>(); 
		List<IbmTarjeta> ibmTarjetas = new ArrayList<>();
		
		try {
			
			for(int a = 0; a < 2; a++) {
				
				if(a == 0) {
					
					ibmClientes = testCase.datosCliente();
					when(iClienteDao.listarClientes()).thenReturn(ibmClientes);
					
					ibmTarjetas = testCase.datosTarjeta();
					when(iTarjetaDao.listarTarjetaPorCliente(1L)).thenReturn(ibmTarjetas);
					
					assertNotNull(clienteService.listarClientes());
					
				}
				
				if(a == 1) {
					
					ibmClientes = null;
					when(iClienteDao.listarClientes()).thenReturn(ibmClientes);
					
					ibmTarjetas = testCase.datosTarjeta();
					when(iTarjetaDao.listarTarjetaPorCliente(1L)).thenReturn(ibmTarjetas);
					
					assertEquals("No se encuetran clientes!.", clienteService.listarClientes().get(0).getMensajeResultado());
					
				}
				
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
