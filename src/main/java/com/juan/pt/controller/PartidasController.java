package com.juan.pt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juan.pt.dto.Partidas;
import com.juan.pt.service.PartidasServiceImpl;

@RestController
@RequestMapping("/api")
public class PartidasController {

	@Autowired PartidasServiceImpl partidasServiceImpl;
	
	@GetMapping("/partidas")
	public List <Partidas>listarPartidas(){
		return partidasServiceImpl.listarPartidas();
	}
	
	@PostMapping("/partidas")
	public Partidas guardarPartidas (Partidas partidas) {
		return partidasServiceImpl.guardarPartidas(partidas);
	}
	
	@GetMapping("/partidas/{id}")
	public Partidas partidasPorId(@PathVariable(name="id_partida") int id) {
		Partidas partidasPorId = new Partidas();
		partidasPorId = partidasServiceImpl.partidasPorId(id);
		return partidasPorId;
	}
	
	@DeleteMapping("/partidas/{id}")
	public void eliminarPartidas (int id) {
		partidasServiceImpl.eliminarPartidas(id);
	}

}