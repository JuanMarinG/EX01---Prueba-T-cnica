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
	
	GetMapping("/perfiles")
	public List <Perfiles> listarPerfiles(){
		return perfilesServiceImpl.listarPerfiles();
	}
	@PostMapping("/perfiles")
	public Perfiles guardarPerfiles (Perfiles perfiles) {
		return perfilesServiceImpl.guardarPerfiles(perfiles);
	}
	
	@PutMapping("/perfiles/{id}")
	public Perfiles actualizarPerfiles(@PathVariable(name="id_perfil")int id, @RequestBody Perfiles perfiles) {
		Perfiles perfil_seleccionado = new Perfiles();
		Perfiles perfil_actualizado = new Perfiles(); 
	}
}
