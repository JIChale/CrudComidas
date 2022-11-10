package com.mx.crudComidas.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.crudComidas.dominio.Comida;

public interface ComidaDao extends CrudRepository<Comida, Integer>{
		
}
