package com.cine.web.cliente.core.service;

import java.util.List;

import com.cine.web.cliente.core.dto.request.ClienteRequest;
import com.cine.web.cliente.core.dto.response.ClienteResponse;
import com.cine.web.cliente.core.entity.Cliente;

public interface ClienteService {

	List<ClienteResponse> allClientes();
	Cliente addCliente(ClienteRequest clienteRequest);
	void deleteCliente(Integer idcliente);
	ClienteResponse findCliente(Integer idcliente);
	
}
