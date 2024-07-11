package it.corso.service;

import java.util.List;

import it.corso.dto.UserDto;
import it.corso.dto.UserRegistrationDto;
import it.corso.model.User;

public interface UserService {

	void addUser(UserRegistrationDto user);

	void updateUser(User user);
	
	void deleteUserById(int id);

	User getUserById(int id);

	List<UserDto> getAllUser();
	
	boolean existsUserByEmail(String email);
	
}
