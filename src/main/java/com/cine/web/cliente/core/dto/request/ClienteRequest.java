package com.cine.web.cliente.core.dto.request;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteRequest {

	private Integer idcli ;
	private String nombres ;
	private String cliPat ;
	private String cliMat;
	private String direccion;
	private Date fechNac ;
	private String telefono ;
	private String dni;
	private String usuario ;
	private String pass;
	private Integer tipoCivil;
	
}
