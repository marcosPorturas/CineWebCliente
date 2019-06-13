package com.cine.web.cliente.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cine.web.cliente.core.dto.request.ClienteRequest;
import com.cine.web.cliente.core.dto.response.ClienteResponse;
import com.cine.web.cliente.core.service.ClienteService;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClienteController {

	@Autowired
	ClienteService clienteService;
	
	@GetMapping
	public List<ClienteResponse> getallClientes(){
		return clienteService.allClientes();
	}
	
	@GetMapping("/{idcliente}")
	public ClienteResponse getCliente(@PathVariable("idcliente") Integer idcliente){
		return clienteService.findCliente(idcliente);
	}
	
	@PostMapping("/add")
	public void addCliente(@RequestBody ClienteRequest clienteRequest) {
		clienteService.addCliente(clienteRequest);
	}
	
	@PutMapping("/update")
	public void updateCliente(@RequestBody ClienteRequest clienteRequest) {
		clienteService.addCliente(clienteRequest);
	}
	
	@DeleteMapping("/delete/{idcliente}")
	public void deleteCliente(@PathVariable("idcliente") Integer idcliente) {
		clienteService.deleteCliente(idcliente);
	}
	
}
