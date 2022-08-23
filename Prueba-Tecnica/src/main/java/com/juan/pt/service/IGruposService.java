package com.juan.pt.service;

import java.util.List;

import com.juan.pt.dto.Grupos;

public interface IGruposService {

	//ALL
	public List<Grupos> listarGrupos();
	//CREATE
	public Grupos guardarGrupos (Grupos grupos);
	
	//UPDATE
	public Grupos actualizarGrupos(Grupos grupos);
	
	//DELETE
	public void eliminarGrupos(int id);
	
	//READ
		public Grupos gruposPorId (int id);
}
