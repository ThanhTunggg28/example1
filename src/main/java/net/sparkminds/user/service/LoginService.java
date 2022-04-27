package net.sparkminds.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.sparkminds.user.common.APIResponse;
import net.sparkminds.user.dto.LoginRequestDto;
import net.sparkminds.user.entity.User;
import net.sparkminds.user.repository.UserRepository;
import net.sparkminds.user.utils.JwtUtils;

@Service
public class LoginService {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private JwtUtils jwtUtils;

	public APIResponse login(LoginRequestDto loginRequestDto) {
		APIResponse apiResponse = new APIResponse();
		
		
		User user = userRepository.findOneByEmailIgnoreCaseAndPassword(loginRequestDto.getEmail(), loginRequestDto.getPassword());
		
		if(user == null) {
			apiResponse.setData("No");
			return apiResponse;
		} 
		
		String token = jwtUtils.generateJwt(user);
		apiResponse.setData(token);
				
		
		return apiResponse;
	}

}
