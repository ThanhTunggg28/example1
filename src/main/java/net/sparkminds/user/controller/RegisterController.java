package net.sparkminds.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.sparkminds.user.common.APIResponse;
import net.sparkminds.user.dto.RegisterRequestDto;
import net.sparkminds.user.service.RegisterService;

@RestController
public class RegisterController {
	
	@Autowired
	private RegisterService registerService;

	@PostMapping(value="/register")
	public ResponseEntity<APIResponse> Register(@RequestBody RegisterRequestDto registerRequestDto) {
		
		APIResponse apiResponse = registerService.register(registerRequestDto);
		
		return ResponseEntity
				.status(apiResponse.getStatus())
				.body(apiResponse);
	}
}
