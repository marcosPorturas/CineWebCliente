package com.cine.web.cliente.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cine.web.cliente.core.entity.Cliente;

@Repository
public interface ClienteRespository extends JpaRepository<Cliente,Integer>{

	@Query("Select MAX(c.idCli) from Cliente c")
	Integer getLastIdCli();

}
