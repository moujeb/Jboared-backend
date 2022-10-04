package jb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jb.model.Role;
import jb.repository.RoleRepository;
@Service
public class RoleServiceImpl implements RoleService {
	@Autowired
	private RoleRepository roleRepository;
	@Override
	public void saveRole(Role role) {
		roleRepository.save(role);
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteRole(Long id) {
		
		roleRepository.deleteById(id);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Role updateRole(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Role> getAllRoles() {
		// TODO Auto-generated method stub
		return roleRepository.findAll();
	}

	@Override
	public Role GetOneByName(String nom) {
		
		return roleRepository.FindByNom(nom);
	}




}
