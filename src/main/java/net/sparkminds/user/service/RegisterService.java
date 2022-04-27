package net.sparkminds.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.sparkminds.user.common.APIResponse;
import net.sparkminds.user.dto.RegisterRequestDto;
import net.sparkminds.user.entity.User;
import net.sparkminds.user.repository.UserRepository;

@Service
public class RegisterService {
	
	@Autowired
	private UserRepository userRepository;

	public APIResponse register(RegisterRequestDto registerRequestDto) {
		APIResponse apiResponse = new APIResponse();
		
		
		User userEntity = new User();
		userEntity.setFirstName(registerRequestDto.getFirstName());
		userEntity.setLastName(registerRequestDto.getLastName());
		userEntity.setEmail(registerRequestDto.getEmail());
		userEntity.setPhone(registerRequestDto.getPhone());
		userEntity.setAddress(registerRequestDto.getAddress());
		userEntity.setPassword(registerRequestDto.getPassword());
		
		
		
		userEntity = userRepository.save(userEntity);
		
		 
		apiResponse.setData("Successfully!!");
		return apiResponse;
	}

	

}
