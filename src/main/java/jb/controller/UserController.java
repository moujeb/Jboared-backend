package jb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jb.model.Role;
import jb.model.User;
import jb.payload.AddUserRequest;
import jb.repository.RoleRepository;
import jb.repository.UserRepository;
import jb.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	@Autowired
	private UserService userService;

	@Autowired
	private UserRepository ur;
	
	@Autowired
	private RoleRepository roleRepo;

	@GetMapping("/users")
	public List<User> getUsers() {
		return (List<User>) ur.findAll();
	}

	@PostMapping("/users")
	void addUser(@RequestBody final AddUserRequest addRequest) {
		Role role = roleRepo.findById(addRequest.getRoleId()).get();
		User user = addRequest.getUser();
		user.setRole(role);
		userService.saveUser(user);
		
	}

}
