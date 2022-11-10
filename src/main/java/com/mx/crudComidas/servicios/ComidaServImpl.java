package com.mx.crudComidas.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.crudComidas.dao.ComidaDao;
import com.mx.crudComidas.dominio.Comida;


@Service
public class ComidaServImpl implements ComidaServ                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           {
//31
	@Autowired
	ComidaDao comidaDao;
	
	@Override
	public void guardar(Comida comida) {
		comidaDao.save(comida);
		
	}
	
	@Override
	public void editar(Comida comida) {
		// TODO Auto-generated method stub
		comidaDao.save(comida);
	}

	@Override
	public void eliminar(Comida comida) {
		// TODO Auto-generated method stub
		comidaDao.delete(comida);
	}

	@Override
	public Comida buscar(Comida comida) {
		// TODO Auto-generated method stub
		return comidaDao.findById(comida.getId()).orElse(null);
	}

	@Override
	public List mostrar() {
		// TODO Auto-generated method stub
		return (List) comidaDao.findAll();
	}

}
