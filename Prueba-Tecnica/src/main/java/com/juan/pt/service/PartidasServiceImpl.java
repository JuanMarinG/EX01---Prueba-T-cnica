package com.juan.pt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juan.pt.dao.IPartidasDAO;
import com.juan.pt.dto.Partidas;

@Service
public class PartidasServiceImpl implements IPartidasService{

	@Autowired IPartidasDAO ipartidasDAO;

	@Override
	public List<Partidas> listarPartidas() {
		// TODO Auto-generated method stub
		return ipartidasDAO.findAll();
	}

	@Override
	public Partidas guardarPartidas(Partidas partidas) {
		// TODO Auto-generated method stub
		return ipartidasDAO.save(partidas);
	}

	@Override
	public void eliminarPartidas(int id) {
		// TODO Auto-generated method stub
		ipartidasDAO.deleteById(id);
	}
	
	
}
