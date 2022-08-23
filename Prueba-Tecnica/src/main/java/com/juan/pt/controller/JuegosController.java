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

import com.juan.pt.dto.Juegos;
import com.juan.pt.service.JuegosServiceImpl;

@RestController
@RequestMapping("/api")
public class JuegosController {

@Autowired JuegosServiceImpl juegosServiceImpl;
	
	@GetMapping("/juegos")
	public List <Juegos>listarJuegos(){
		return juegosServiceImpl.listarJuegos();
	}
	@PostMapping("/juegos")
	public Juegos guardarJuegos (Juegos juegos) {
		return juegosServiceImpl.guardarJuegos(juegos);
	}
	
	@GetMapping("/juegos/{id}")
	public Juegos JuegosPorId(@PathVariable(name="id_juego") int id) {
		Juegos juegosPorId = new Juegos();
		juegosPorId = juegosServiceImpl.juegosPorId(id);
		return juegosPorId;
	}
	
	@PutMapping("/juegos/{id}")
	public Juegos actualizarJuegos(@PathVariable(name="id_juego")int id, @RequestBody Juegos juegos){
		Juegos juego_seleccionado = new Juegos();
		Juegos juego_actualizado = new Juegos();
		
		juego_seleccionado = juegosServiceImpl.juegosPorId(id);
		juego_seleccionado.setIdJuego(juegos.getIdJuego());
		juego_actualizado = juegosServiceImpl.actualizarJuegos(juego_seleccionado);
		return juego_actualizado;
	}
	
	@DeleteMapping("/juegos/{id}")
	public void eliminarJuegos (int id) {
		juegosServiceImpl.eliminarJuegos(id);
	}
}


