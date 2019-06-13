package com.cine.web.cliente.core.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cine.web.cliente.core.dto.request.ClienteRequest;
import com.cine.web.cliente.core.dto.response.ClienteResponse;
import com.cine.web.cliente.core.entity.Cliente;
import com.cine.web.cliente.core.entity.TipoCivil;
import com.cine.web.cliente.core.repository.ClienteRespository;

@Service
public class ClienteServiceImplement implements ClienteService{

	@Autowired
	ClienteRespository clienteRespository;

	@Override
	public List<ClienteResponse> allClientes() {
		// TODO Auto-generated method stub
		List<ClienteResponse> lstClienteResp = new ArrayList<ClienteResponse>();
		for(Cliente cliente : clienteRespository.findAll()) {
			ClienteResponse  clienteResp = new ClienteResponse();
			clienteResp.setIdcli(cliente.getIdCli());
			clienteResp.setNombres(cliente.getNombres());
			clienteResp.setCliPat(cliente.getCliPat());
			clienteResp.setCliMat(cliente.getCliMat());
			clienteResp.setDireccion(cliente.getDireccion());
			clienteResp.setFechNac(cliente.getFechNac());
			clienteResp.setFechAfi(cliente.getFechAfi());
			clienteResp.setTelefono(cliente.getTelefono());
			clienteResp.setDni(cliente.getDni());
			clienteResp.setUsuario(cliente.getUsuario());
			clienteResp.setContraseña(cliente.getPass());
			clienteResp.setTipoCivil(cliente.getTipoCivil().getNomCivil());
			lstClienteResp.add(clienteResp);
		}
		return lstClienteResp;
	}

	@Override
	public Cliente addCliente(ClienteRequest clienteRequest) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente();
		if(clienteRequest.getIdcli()==null) {
			cliente.setIdCli(generarCodigoCliente());
		}else {
			cliente.setIdCli(cliente.getIdCli());
		}
		cliente.setNombres(clienteRequest.getNombres());
		cliente.setCliPat(clienteRequest.getCliPat());
		cliente.setCliMat(clienteRequest.getCliMat());
		cliente.setDireccion(clienteRequest.getDireccion());
		cliente.setDni(clienteRequest.getDireccion());
		cliente.setFechNac(clienteRequest.getFechNac());
		cliente.setFechAfi(new Date());
		cliente.setTelefono(clienteRequest.getTelefono());
		cliente.setDni(clienteRequest.getDni());
		cliente.setUsuario(clienteRequest.getUsuario());
		cliente.setPass(clienteRequest.getPass());
		
		TipoCivil estCivil = new TipoCivil();
		estCivil.setTipoCivil(clienteRequest.getTipoCivil());
		
		cliente.setTipoCivil(estCivil);
		
		return clienteRespository.save(cliente);
	}

	@Override
	public void deleteCliente(Integer idcliente) {
		clienteRespository.deleteById(idcliente);
	}

	@Override
	public ClienteResponse findCliente(Integer idcliente) {
		// TODO Auto-generated method stub
		Cliente cliente = clienteRespository.findById(idcliente).get();
		ClienteResponse  clienteResp = new ClienteResponse();
		clienteResp.setIdcli(cliente.getIdCli());
		clienteResp.setNombres(cliente.getNombres());
		clienteResp.setCliPat(cliente.getCliPat());
		clienteResp.setCliMat(cliente.getCliMat());
		clienteResp.setDireccion(cliente.getDireccion());
		clienteResp.setFechNac(cliente.getFechNac());
		clienteResp.setFechAfi(cliente.getFechAfi());
		clienteResp.setTelefono(cliente.getTelefono());
		clienteResp.setDni(cliente.getDni());
		clienteResp.setUsuario(cliente.getUsuario());
		clienteResp.setContraseña(cliente.getPass());
		clienteResp.setTipoCivil(cliente.getTipoCivil().getNomCivil());		
		return clienteResp;
	}
	
	public Integer generarCodigoCliente() {
		  Integer idcliente;
		  idcliente = clienteRespository.getLastIdCli();
	      if(idcliente==null)idcliente=10000;
	      return idcliente+1;
	}
	
}
