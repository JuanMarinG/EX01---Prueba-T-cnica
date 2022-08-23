package com.juan.pt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juan.pt.dao.IGruposDAO;
import com.juan.pt.dto.Grupos;

@Service
public class GruposServiceImpl implements IGruposService{

	@Autowired
	IGruposDAO igruposDAO;
	@Override
	public List<Grupos> listarGrupos() {
		// TODO Auto-generated method stub
		return igruposDAO.findAll();
	}

	@Override
	public Grupos guardarGrupos(Grupos grupos) {
		// TODO Auto-generated method stub
		return igruposDAO.save(grupos);
	}

	@Override
	public Grupos actualizarGrupos(Grupos grupos) {
		// TODO Auto-generated method stub
		return igruposDAO.save(grupos);
	}

	@Override
	public void eliminarGrupos(int id) {
		// TODO Auto-generated method stub
		igruposDAO.deleteById(id);
	}

	
}
