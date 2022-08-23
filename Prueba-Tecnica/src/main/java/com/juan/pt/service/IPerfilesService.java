package com.juan.pt.service;

import java.util.List;

import com.juan.pt.dto.Perfiles;

public interface IPerfilesService {

	//ALL
	public List<Perfiles> listarPerfiles();
	//CREATE
	public Perfiles guardarPerfiles(Perfiles perfiles);
	//UPDATE
	public Perfiles actualizarPerfiles (Perfiles perfiles);
}
