package com.juan.pt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juan.pt.dto.Roles;
import com.juan.pt.service.RolesServiceImpl;

@RestController
@RequestMapping("/api")
public class RolesController {

	@Autowired RolesServiceImpl rolesServiceImpl;
	
	@GetMapping("/roles")
	public List<Roles>listarRoles(){
		return rolesServiceImpl.listarRoles();
	}
	
	@PostMapping("/roles")
	public Roles guardarRoles (Roles roles) {
		return rolesServiceImpl.guardarRoles(roles);
	}
	
	@PutMapping("/roles/{id}")
	public Roles actualizarRoles(@PathVariable(name = "id")int id,@RequestBody Roles roles) {
		Roles rol_seleccionado = new Roles();
		Roles rol_actualizado = new Roles ();
		
	rol_seleccionado = rolesServiceImpl.rolesPorId(id);
	rol_seleccionado.setId(roles.getId());
	rol_actualizado = rolesServiceImpl.actualizarRoles(rol_seleccionado);
	return rol_actualizado;}
	
	@GetMapping("/roles/{id}")
	public Roles rolesPorId(@PathVariable(name = "id")int id) {
		Roles rolesPorId = new Roles();
		rolesPorId = rolesServiceImpl.rolesPorId(id);
		return rolesPorId;
	}
	
	@DeleteMapping("/roles/{id}")
	public void eliminarRoles(int id) {
		rolesServiceImpl.eliminarRoles(id);
	}
	
}
