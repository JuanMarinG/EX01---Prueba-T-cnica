package com.juan.pt.service;
import java.util.List;
import com.juan.pt.dto.Roles;

public interface IRolesService {

	//ALL
	public List<Roles> listarRoles();
	//CREATE
	public Roles guardarRoles (Roles roles);
	//READ
	public Roles rolesPorId (int id);
	//UPDATE
	public Roles actualizarRoles (Roles roles);
	//DELETE
	public void eliminarRoles (int id);
}
