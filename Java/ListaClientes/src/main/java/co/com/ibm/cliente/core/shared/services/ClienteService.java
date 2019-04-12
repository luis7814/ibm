package co.com.ibm.cliente.core.shared.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.ibm.cliente.core.commons.entities.Cliente;
import co.com.ibm.cliente.core.commons.entities.Tarjeta;
import co.com.ibm.cliente.repository.commons.dao.IClienteDao;
import co.com.ibm.cliente.repository.commons.dao.ITarjetaDao;
import co.com.ibm.cliente.repository.commons.entities.IbmCliente;
import co.com.ibm.cliente.repository.commons.entities.IbmTarjeta;

@Service
public class ClienteService implements IClienteService{

	@Autowired
	private IClienteDao iClienteDao;
	
	@Autowired
	private ITarjetaDao iTarjetaDao;
	
	private List<IbmCliente> ibmClientes;
	private List<Cliente> clientes;
	private List<IbmTarjeta> ibmTarjetas;
	private List<Tarjeta> tarjetas;
	
	private Cliente cliente;
	private Tarjeta tarjeta;
	
	
	@Override
	public List<Cliente> listarClientes() {
		// TODO Auto-generated method stub
		
		clientes = new ArrayList<>();
		
		try {
			
			ibmClientes = iClienteDao.listarClientes();
			
			for(int a = 0; a < ibmClientes.size(); a++) {
				
				cliente = new Cliente();
				cliente.setClienteId(ibmClientes.get(a).getClienteId());
				cliente.setClienteNombre(ibmClientes.get(a).getClienteNombre());
				cliente.setClienteTelefono(ibmClientes.get(a).getClienteTelefono());
				cliente.setClienteCiudad(ibmClientes.get(a).getClienteCiudad());
				cliente.setClienteDireccion(ibmClientes.get(a).getClienteDireccion());
				
				ibmTarjetas = iTarjetaDao.listarTarjetaPorCliente(ibmClientes.get(a).getClienteId());
				
				tarjetas = new ArrayList<>();
				
				for(int b = 0; b < ibmTarjetas.size(); b++) {
					
					tarjeta = new Tarjeta();
					tarjeta.setTarjetaId(ibmTarjetas.get(b).getTarjetaId());
					tarjeta.setTarjetaNumero(ibmTarjetas.get(b).getTarjetaNumero());
					tarjeta.setTarjetaCcv(ibmTarjetas.get(b).getTarjetaCcv());
					tarjeta.setTarjetaTipo(ibmTarjetas.get(b).getTarjetaTipo());
					
					tarjetas.add(tarjeta);
					
				}
				
				cliente.setCantidadTarjetas(String.valueOf(ibmTarjetas.size()));
				cliente.setTarjetas(tarjetas);
				
				clientes.add(cliente);
			}
			
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return clientes;
	}

}
