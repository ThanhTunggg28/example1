package net.sparkminds.user.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.sparkminds.user.dto.LoginRequestDto;
import net.sparkminds.user.service.LoginService;

@RestController
@RequestMapping("/api/login")
public class LoginController {

	@Autowired
	private final LoginService loginService;
	
	public LoginController(LoginService loginService) {
		this.loginService = loginService;
	}

	@PostMapping
	public ResponseEntity<?> Login(@RequestBody LoginRequestDto loginRequestDto) {
		
		loginService.login(loginRequestDto);
		
		return ResponseEntity.noContent().build();
	}
}
