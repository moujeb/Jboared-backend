package jb.service;

import java.util.List;

import jb.model.Role;

public interface RoleService {
	
    public void saveRole(Role role);
	
	void deleteRole(Long id);
	
	Role updateRole(Long id);
	
	Role GetOneByName(String nom);
	
	List<Role> getAllRoles();


}
