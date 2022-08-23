package com.juan.pt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juan.pt.dao.IJuegosDAO;
import com.juan.pt.dto.Juegos;

@Service
public class JuegosServiceImpl implements IJuegosService{

	@Autowired IJuegosDAO ijuegosDAO;

	@Override
	public List<Juegos> listarJuegos() {
		// TODO Auto-generated method stub
		return ijuegosDAO.findAll();
	}

	@Override
	public Juegos guardarJuegos(Juegos juegos) {
		// TODO Auto-generated method stub
		return ijuegosDAO.save(juegos);
	}

	@Override
	public Juegos juegosPorId(int id) {
		// TODO Auto-generated method stub
		return ijuegosDAO.findById(id).get();
	}

	@Override
	public Juegos actualizarJuegos(Juegos juegos) {
		// TODO Auto-generated method stub
		return ijuegosDAO.save(juegos);
	}

	@Override
	public void eliminarJuegos(int id) {
		// TODO Auto-generated method stub
		ijuegosDAO.deleteById(id);
	}
	
	
}
