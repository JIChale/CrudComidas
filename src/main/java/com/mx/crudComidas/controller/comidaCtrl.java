package com.mx.crudComidas.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mx.crudComidas.dominio.Comida;
import com.mx.crudComidas.servicios.ComidaServ;

import lombok.var;

@Controller
@RequestMapping("/operacionesComida")
public class comidaCtrl {
	
	@Autowired
	ComidaServ comidaServ;
	
	
	@GetMapping("/inicio")
	public String inicio(Model model) {
		ArrayList<String> lista=new ArrayList<>();
		lista=(ArrayList<String>) comidaServ.mostrar();
		model.addAttribute("lista", lista);
		return "index";
	}
	
	@GetMapping("/alta")
	public String alta(Comida comida) {
		
		return "agregar";
	}
	
	@PostMapping("/guardar")
    public String guardar(Comida comida) {
    	
		comidaServ.guardar(comida); 
    	return "redirect:/operacionesComida/inicio";
    }
	
	@GetMapping("/borrar/{id}")
	public String borrar(Comida comida, Model model) {
		comida=comidaServ.buscar(comida);
		model.addAttribute("comida", comida);
		return "eliminar";
	}
	
	@PostMapping("/eliminar")
    public String eliminar(Comida comida) {
    	
		comidaServ.eliminar(comida); 
    	return "redirect:/operacionesComida/inicio";
    }
	
	@GetMapping("/actualizar/{id}")
	public String actualizar(Comida comida, Model model) {
		comida=comidaServ.buscar(comida);
		model.addAttribute("comida", comida);
		return "modificar";
	}
	
	@PostMapping("/editar")
    public String editar(Comida comida) {
    	
		comidaServ.editar(comida); 
    	return "redirect:/operacionesComida/inicio";
    }
}
