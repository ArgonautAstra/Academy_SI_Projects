package it.corso.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.commons.codec.digest.DigestUtils;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.corso.dao.UserDao;
import it.corso.dto.UserDto;
import it.corso.dto.UserRegistrationDto;
import it.corso.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	// L'oggetto ModelMapper permette di mappare le liste in altre listeDTO
	
	private ModelMapper modelMapper = new ModelMapper();
	
	@Override
	public void addUser(UserRegistrationDto userRegistration) {
		
		User user = new User();

		user.setFirstname(userRegistration.getFirstname());
		user.setLastname(userRegistration.getLastname());
		user.setEmail(userRegistration.getEmail());		
		user.setPassword(DigestUtils.sha256Hex(userRegistration.getPassword()));
		
		userDao.save(user);		
	}

	@Override
	public void updateUser(User user) {
		
		Optional<User> optional = userDao.findById(user.getId());
		
		if(optional.isPresent()) {
		
			User userDb = (User) optional.get();
			
			userDb.setFirstname(user.getFirstname());
			userDb.setLastname(user.getLastname());
			userDb.setEmail(user.getEmail());
			String password = DigestUtils.sha256Hex(user.getPassword());
			userDb.setPassword(password);
			
			userDao.save(userDb);
		}
	
	}

	@Override
	public void deleteUserById(int id) {
		
		Optional<User> optional = userDao.findById(id);
		
		if(optional.isPresent())
			userDao.delete(optional.get());
	}

	@Override
	public User getUserById(int id) {
		
		Optional<User> optional = userDao.findById(id);
		
		return !optional.isPresent() ? new User() : (User) optional.get();
	}

	@Override
	public List<UserDto> getAllUser() {

		List<User> user = (List<User>) userDao.findAll();
		List<UserDto> userDto = new ArrayList<>();
		
		// Funzione lambda che mappa, tramite ModelMapper, gli elementi
		// di User in UserDTo con il forEach.
		
		user.forEach(u -> userDto.add(modelMapper.map(u, UserDto.class)));
		
		return userDto;
	}

	@Override
	public boolean existsUserByEmail(String email) {
		return userDao.existsByEmail(email);
	}

}
