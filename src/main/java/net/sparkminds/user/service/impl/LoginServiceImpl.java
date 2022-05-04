package net.sparkminds.user.service.impl;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;

import net.sparkminds.user.dto.LoginRequestDto;
import net.sparkminds.user.entity.User;
import net.sparkminds.user.repository.UserRepository;
import net.sparkminds.user.service.LoginService;
import net.sparkminds.user.utils.JwtUtils;

public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private JwtUtils jwtUtils;

	public void login(LoginRequestDto loginRequestDto) {
		
		
		
		User user = userRepository.findOneByEmailIgnoreCaseAndPassword(loginRequestDto.getEmail(), loginRequestDto.getPassword());
		
		if(user == null) {
			throw new EntityNotFoundException("Image is not exist");
		} 
		
		String token = jwtUtils.generateJwt(user);
		loginRequestDto.setJwts(token);
		
	}
}
