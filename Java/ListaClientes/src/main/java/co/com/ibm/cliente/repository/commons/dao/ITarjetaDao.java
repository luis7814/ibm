package co.com.ibm.cliente.repository.commons.dao;

import java.util.List;

import co.com.ibm.cliente.repository.commons.entities.IbmTarjeta;

public interface ITarjetaDao {

	public List<IbmTarjeta> listarTarjetaPorCliente(Long clienteId) throws Exception;
}
