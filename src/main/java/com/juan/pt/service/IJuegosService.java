package com.juan.pt.service;

import java.util.List;

import com.juan.pt.dto.Juegos;

public interface IJuegosService {

	//ALL
	public List <Juegos> listarJuegos ();
	//CREATE
	public Juegos guardarJuegos (Juegos juegos);
	//READ
	public Juegos juegosPorId(int id);
	//UPDATE
	public Juegos actualizarJuegos(Juegos juegos);
	//DELETE
	public void eliminarJuegos (int id);
}
