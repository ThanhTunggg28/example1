package net.sparkminds.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.sparkminds.user.dto.RegisterRequestDto;
import net.sparkminds.user.entity.User;
import net.sparkminds.user.service.RegisterService;

@RestController
@RequestMapping("/api/register")
public class RegisterController {
	
	@Autowired
	private final RegisterService registerService;
	public RegisterController(RegisterService registerService) {
		this.registerService = registerService;
	}

	@PostMapping
	public ResponseEntity<User> Register(@RequestBody RegisterRequestDto registerRequestDto) {
		
		User user = registerService.register(registerRequestDto);
		
		return ResponseEntity.ok(user);
				
	}
}
