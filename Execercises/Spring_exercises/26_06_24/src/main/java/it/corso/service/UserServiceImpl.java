package it.corso.service;

import java.util.List;
import java.util.Optional;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.corso.dao.UserDao;
import it.corso.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public void addUser(User user) {
		
		user.setPassword(DigestUtils.sha256Hex(user.getPassword()));
		
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
	public List<User> getAllUser() {
		return (List<User>) userDao.findAll();
	}

	@Override
	public boolean existsUserByEmail(String email) {
		return userDao.existsByEmail(email);
	}

}
