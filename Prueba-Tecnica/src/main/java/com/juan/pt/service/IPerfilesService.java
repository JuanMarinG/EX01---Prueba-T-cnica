package com.juan.pt.service;

import java.util.List;

import com.juan.pt.dto.Perfiles;
import com.juan.pt.dto.Roles;

public interface IPerfilesService {

	//ALL
	public List<Perfiles> listarPerfiles();
	//CREATE
	public Perfiles guardarPerfiles(Perfiles perfiles);
	//UPDATE
	public Perfiles actualizarPerfiles (Perfiles perfiles);
	//READ
	public Perfiles perfilesPorId (int id);
}
