package jb.service;

import java.util.List;
import java.util.Optional;

import javax.management.relation.Role;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import jb.model.User;
import jb.repository.RoleRepository;
import jb.repository.UserRepository;
@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepo;
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	
	@Override
	public  User saveUser(User user) {
		 return userRepository.save(user);
		// TODO Auto-generated method stub
	
		
	}

	@Override
	public void deleteUser(Long id) {
		
		userRepository.deleteById(id);
		// TODO Auto-generated method stub
		
	}

	@Override
	public User updateUser(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		List<User> users=userRepository.findAll();
	
		
		return users;
	}
	


}
