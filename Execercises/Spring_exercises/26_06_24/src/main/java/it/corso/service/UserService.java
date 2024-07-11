package it.corso.service;

import java.util.List;

import it.corso.model.User;

public interface UserService {

	void addUser(User user);

	void updateUser(User user);
	
	void deleteUserById(int id);

	User getUserById(int id);

	List<User> getAllUser();
	
	boolean existsUserByEmail(String email);
	
}
