package co.com.ibm.historial.core.shared.services;

import co.com.ibm.historial.core.commons.entities.Cliente;

public interface IClienteService {

	public Cliente consultarConsumoCliente(String clienteId, String tarjetaId);
}
