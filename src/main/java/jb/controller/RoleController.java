package jb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jb.model.CabinetExpertise;
import jb.model.Role;
import jb.service.CabinetExpertiseService;
import jb.service.RoleService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class RoleController {
	
	@Autowired
	private RoleService roleService;


	@GetMapping("/roles")
	public List<Role> getallRoles() {
		return (List<Role>) roleService.getAllRoles();
	}

	@PostMapping("/roleAdd")
	void addUser(@RequestBody Role role) {
		
		roleService.saveRole(role);
	}

}
