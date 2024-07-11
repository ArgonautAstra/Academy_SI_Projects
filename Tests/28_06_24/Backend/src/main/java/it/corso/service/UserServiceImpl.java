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
import it.corso.dto.UserLoginRequestDto;
import it.corso.dto.UserSignupDto;
import it.corso.dto.UserUpdateDto;
import it.corso.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	private ModelMapper modelMapper = new ModelMapper();

	@Override
	public void userSignup(UserSignupDto userSignupDto) {

		User user = new User();

		user.setFirstname(userSignupDto.getFirstname());
		user.setLastname(userSignupDto.getLastname());
		user.setEmail(userSignupDto.getEmail());		
		user.setPassword(DigestUtils.sha256Hex(userSignupDto.getPassword()));
		
		userDao.save(user);	
	}

	@Override
	public void userUpdate(UserUpdateDto userUpdateDto) {
		
		Optional<User> optional = userDao.findByEmail(userUpdateDto.getEmail());
		
		if(optional.isPresent()) {
		
			User userDb = (User) optional.get();

			userDb.setFirstname(userUpdateDto.getFirstname());
			userDb.setLastname(userUpdateDto.getLastname());
			userDb.setEmail(userUpdateDto.getEmail());
			userDb.setRoles(userUpdateDto.getRoles());
			
			userDao.save(userDb);
		}
		
	}

	@Override
	public void userDelete(String email) {
		
		Optional<User> optional = userDao.findByEmail(email);
		
		if(optional.isPresent())
			userDao.delete(optional.get());
		
	}

	@Override
	public User getUserByEmail(String email) {
		
		Optional<User> optional = userDao.findByEmail(email);
		
		if(optional.isPresent())
	        return optional.get();
		
		return new User();
	}
	
	@Override
	public UserDto getUserDtoByEmail(String email) {
		
		Optional<User> optional = userDao.findByEmail(email);
		
		if(optional.isPresent()) {
			User user = optional.get();
			
	        return modelMapper.map(user, UserDto.class);
		}
		
		return new UserDto();
	}
	
	@Override
	public List<UserDto> getAllUser() {

		List<User> user = (List<User>) userDao.findAll();
		List<UserDto> userDto = new ArrayList<>();
		
		user.forEach(u -> userDto.add(modelMapper.map(u, UserDto.class)));
		
		return userDto;
	}

	@Override
	public boolean existsUserByEmail(String email) {
		return userDao.existsByEmail(email);
	}

	@Override
	public boolean login(UserLoginRequestDto userLoginRequest) {
		
		String password = DigestUtils.sha256Hex(userLoginRequest.getPassword());
		
		Optional<User> optional = userDao.findByEmailAndPassword(userLoginRequest.getEmail(), password);
		if(optional.isPresent()) 
			return true;
		else
			return false;
	}

}
