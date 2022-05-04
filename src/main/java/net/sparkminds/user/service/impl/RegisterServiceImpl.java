package net.sparkminds.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import net.sparkminds.user.dto.RegisterRequestDto;
import net.sparkminds.user.entity.User;
import net.sparkminds.user.repository.UserRepository;
import net.sparkminds.user.service.RegisterService;

public class RegisterServiceImpl implements RegisterService {

	@Autowired
	private UserRepository userRepository;

	public User register(RegisterRequestDto registerRequestDto) {
		
		
		User userEntity = new User();
		userEntity.setFirstName(registerRequestDto.getFirstName());
		userEntity.setLastName(registerRequestDto.getLastName());
		userEntity.setEmail(registerRequestDto.getEmail());
		userEntity.setPhone(registerRequestDto.getPhone());
		userEntity.setAddress(registerRequestDto.getAddress());
		userEntity.setPassword(registerRequestDto.getPassword());
		
		
		
		return userRepository.save(userEntity);
		
		 
		
	}
}
