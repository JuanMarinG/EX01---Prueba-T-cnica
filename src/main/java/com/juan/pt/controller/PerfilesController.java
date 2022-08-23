package com.juan.pt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.juan.pt.dto.Perfiles;
import com.juan.pt.service.PerfilesServiceImpl;

@RestController
@RequestMapping("/api")
public class PerfilesController {
	
	@Autowired PerfilesServiceImpl perfilesServiceImpl;
	
	@GetMapping("/perfiles")
	public List <Perfiles> listarPerfiles(){
		return perfilesServiceImpl.listarPerfiles();
	}
	@PostMapping("/perfiles")
	public Perfiles guardarPerfiles (Perfiles perfiles) {
		return perfilesServiceImpl.guardarPerfiles(perfiles);
	}
	
	@GetMapping("/perfiles/{id}")
	public Perfiles perfilesPorId(@PathVariable(name="id_perfil")int id) {
		Perfiles perfilesPorId = new Perfiles();
		perfilesPorId = perfilesServiceImpl.perfilesPorId(id);
		return perfilesPorId;
	}
	
	@PutMapping("/perfiles/{id}")
	public Perfiles actualizarPerfiles(@PathVariable(name="id_perfil")int id, @RequestBody Perfiles perfiles) {
		Perfiles perfil_seleccionado = new Perfiles();
		Perfiles perfil_actualizado = new Perfiles(); 
		
		perfil_seleccionado = perfilesServiceImpl.perfilesPorId(id);
		perfil_seleccionado.setIdPerfil(perfiles.getIdPerfil());
		perfil_actualizado = perfilesServiceImpl.actualizarPerfiles(perfil_seleccionado);
		return perfil_actualizado;
		
	}
	
	
}
