package jb.service;

import java.util.List;
import jb.model.User;



public interface UserService {
	
	User saveUser(User user);
	
	void deleteUser(Long id);
	
	User updateUser(Long id);
	
	List<User> getAllUsers();
	

}
