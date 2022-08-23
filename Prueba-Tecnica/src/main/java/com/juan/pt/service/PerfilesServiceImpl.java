package com.juan.pt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juan.pt.dao.IPerfilesDAO;
import com.juan.pt.dto.Perfiles;
import com.juan.pt.dto.Roles;

@Service
public class PerfilesServiceImpl implements IPerfilesService {

	@Autowired
	IPerfilesDAO iperfilesDAO;
	
	@Override
	public List<Perfiles> listarPerfiles() {
		// TODO Auto-generated method stub
		return iperfilesDAO.findAll();
	}

	@Override
	public Perfiles guardarPerfiles(Perfiles perfiles) {
		// TODO Auto-generated method stub
		return iperfilesDAO.save(perfiles);
	}

	@Override
	public Perfiles actualizarPerfiles(Perfiles perfiles) {
		// TODO Auto-generated method stub
		return iperfilesDAO.save(perfiles);
	}

	@Override
	public Perfiles perfilesPorId(int id) {
		// TODO Auto-generated method stub
		return iperfilesDAO.findById(id).get();
	}
}
