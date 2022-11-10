package com.mx.crudComidas.servicios;

import java.util.List;

import com.mx.crudComidas.dominio.Comida;

public interface ComidaServ {

	public void guardar(Comida comida);
	public void editar(Comida comida);
	public void eliminar(Comida comida);
	public Comida buscar(Comida comida);
	public List mostrar();
}
