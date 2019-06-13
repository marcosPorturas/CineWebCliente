package com.cine.web.cliente.core.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "est_civil")
@Getter
@Setter
public class TipoCivil {
	
	@Id
	private Integer tipoCivil;
	private String nomCivil;
	
}
