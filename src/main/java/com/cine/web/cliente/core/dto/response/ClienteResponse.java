package com.cine.web.cliente.core.dto.response;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteResponse {

	private Integer idcli ;
	private String nombres ;
	private String cliPat ;
	private String cliMat;
	private String direccion;
	private Date fechNac ;
	private Date fechAfi ;
	private String telefono ;
	private String dni;
	private String usuario ;
	private String contraseña;
	private String tipoCivil;
	
	
}
