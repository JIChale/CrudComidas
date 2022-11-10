package com.mx.crudComidas.dominio;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="COMIDAS")
public class Comida {
	@Id
	int id;
	String nombre,region;
	double precio;
	
	public Comida() {
		
	}
	
	public Comida(int id, String nombre, String region, double precio) {
		this.id = id;
		this.nombre = nombre;
		this.region = region;
		this.precio = precio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Comida [id=" + id + ", nombre=" + nombre + ", region=" + region + ", precio=" + precio + "]";
	}
	
}