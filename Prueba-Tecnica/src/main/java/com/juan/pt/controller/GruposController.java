package com.juan.pt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juan.pt.dto.Grupos;
import com.juan.pt.service.GruposServiceImpl;



@RestController
@RequestMapping("/api")
public class GruposController {

	@Autowired GruposServiceImpl gruposServiceImpl;
	
	@GetMapping("/grupos")
	public List <Grupos>listarGrupos(){
		return gruposServiceImpl.listarGrupos();
	}
	@PostMapping("/grupos")
	public Grupos guardarGrupos (Grupos grupos) {
		return gruposServiceImpl.guardarGrupos(grupos);
	}
	
	@GetMapping("/grupos/{id}")
	public Grupos GruposPorId(@PathVariable(name="id_grupo") int id) {
		Grupos gruposPorId = new Grupos();
		gruposPorId = gruposServiceImpl.gruposPorId(id);
		return gruposPorId;
	}
	
	@PutMapping("/grupos/{id}")
	public Grupos actualizarGrupos(@PathVariable(name="id_grupo")int id, @RequestBody Grupos grupos){
		Grupos grupo_seleccionado = new Grupos();
		Grupos grupo_actualizado = new Grupos();
		
		grupo_seleccionado = gruposServiceImpl.gruposPorId(id);
		grupo_seleccionado.setIdGrupo(grupos.getIdGrupo());
		grupo_actualizado = gruposServiceImpl.actualizarGrupos(grupo_seleccionado);
		return grupo_actualizado;
	}
	
	@DeleteMapping("/grupos/{id}")
	public void eliminarGrupos (int id) {
		gruposServiceImpl.eliminarGrupos(id);
	}
}
