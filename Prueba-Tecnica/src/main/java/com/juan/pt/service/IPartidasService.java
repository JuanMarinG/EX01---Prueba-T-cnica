package com.juan.pt.service;
import java.util.List;

import com.juan.pt.dto.Partidas;

public interface IPartidasService {

	//ALL
	public List<Partidas> listarPartidas();
	//CREATE
	public Partidas guardarPartidas (Partidas partidas);
	//DELETE
	public void  eliminarPartidas (int id);
}
