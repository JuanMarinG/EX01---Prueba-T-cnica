package com.juan.pt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juan.pt.dao.IRolesDAO;
import com.juan.pt.dto.Roles;

@Service
public class RolesServiceImpl implements IRolesService{

	@Autowired IRolesDAO irolesDAO;

	@Override
	public List<Roles> listarRoles() {
		// TODO Auto-generated method stub
		return irolesDAO.findAll();
	}

	@Override
	public Roles guardarRoles(Roles roles) {
		// TODO Auto-generated method stub
		return irolesDAO.save(roles);
	}

	@Override
	public Roles rolesPorId(int id) {
		// TODO Auto-generated method stub
		return irolesDAO.findById(id).get();
	}

	@Override
	public Roles actualizarRoles(Roles roles) {
		// TODO Auto-generated method stub
		return irolesDAO.save(roles);
	}

	@Override
	public void eliminarRoles(int id) {
		// TODO Auto-generated method stub
		irolesDAO.deleteById(id);
	}
	
}
