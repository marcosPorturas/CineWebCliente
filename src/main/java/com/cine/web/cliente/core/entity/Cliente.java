package com.cine.web.cliente.core.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Cliente {

	@Id
	private Integer idCli ;
	private String nombres ;
	private String cliPat ;
	private String cliMat;
	private String direccion;
	@Temporal(TemporalType.DATE)
	private Date fechNac ;
	@Temporal(TemporalType.DATE)
	private Date fechAfi ;
	private String telefono ;
	private String dni;
	private String usuario ;
	private String pass;	
	
	@ManyToOne
	@JoinColumn(name="tipoCivil")
	private TipoCivil tipoCivil;
	
}
