package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import co.com.ibm.cliente.repository.commons.entities.IbmCliente;
import co.com.ibm.cliente.repository.commons.entities.IbmTarjeta;

public class TestCase {
	
	public List<IbmCliente> datosCliente() {
		
		IbmCliente ibmCliente;
		List<IbmCliente> ibmClientes = new ArrayList<IbmCliente>();
		
		ibmCliente = new IbmCliente();
		ibmCliente.setClienteCiudad("Ciudad_1");
		ibmCliente.setClienteDireccion("Direccion_1");
		ibmCliente.setClienteId(1L);
		ibmCliente.setClienteNombre("Nombre_1");
		ibmCliente.setClienteTelefono("123 456");
		ibmClientes.add(ibmCliente);
		
		ibmCliente = new IbmCliente();
		ibmCliente.setClienteCiudad("Ciudad_2");
		ibmCliente.setClienteDireccion("Direccion_2");
		ibmCliente.setClienteId(2L);
		ibmCliente.setClienteNombre("Nombre_2");
		ibmCliente.setClienteTelefono("123 456");
		ibmClientes.add(ibmCliente);
		
		ibmCliente = new IbmCliente();
		ibmCliente.setClienteCiudad("Ciudad_3");
		ibmCliente.setClienteDireccion("Direccion_3");
		ibmCliente.setClienteId(3L);
		ibmCliente.setClienteNombre("Nombre_3");
		ibmCliente.setClienteTelefono("123 456");
		ibmClientes.add(ibmCliente);
		
		return ibmClientes;
		
	}
	
	public List<IbmTarjeta> datosTarjeta() {
		
		IbmTarjeta ibmTarjeta;
		List<IbmTarjeta> ibmTarjetas = new ArrayList<>();
		
		ibmTarjeta = new IbmTarjeta();
		ibmTarjeta.setClienteId(1L);
		ibmTarjeta.setTarjetaCcv("345");
		ibmTarjeta.setTarjetaId(1L);
		ibmTarjeta.setTarjetaNumero("3452 3454 3345 4345");
		ibmTarjeta.setTarjetaTipo("12334");
		ibmTarjetas.add(ibmTarjeta);
		
		ibmTarjeta = new IbmTarjeta();
		ibmTarjeta.setClienteId(2L);
		ibmTarjeta.setTarjetaCcv("567");
		ibmTarjeta.setTarjetaId(2L);
		ibmTarjeta.setTarjetaNumero("5673 5673 5673 5673");
		ibmTarjeta.setTarjetaTipo("123");
		ibmTarjetas.add(ibmTarjeta);
		
		return ibmTarjetas;
		
	}
	
	
}
