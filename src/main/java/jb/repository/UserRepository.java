package jb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jb.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
