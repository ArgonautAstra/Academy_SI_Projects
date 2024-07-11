package it.corso.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import it.corso.model.User;

public interface UserDao extends CrudRepository<User, Integer> {

	// Query method

	boolean existsByEmail(String email);
	
	//List<User> findByFirstnameAndLastname();
	
}
