package net.sparkminds.user.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.sparkminds.user.common.APIResponse;
import net.sparkminds.user.dto.LoginRequestDto;
import net.sparkminds.user.service.LoginService;

@RestController
public class LoginController {

	@Autowired
	private LoginService loginService;

	@PostMapping(value="/login")
	public ResponseEntity<APIResponse> Login(@RequestBody LoginRequestDto loginRequestDto) {
		
		APIResponse apiResponse = loginService.login(loginRequestDto);
		
		return ResponseEntity
				.status(apiResponse.getStatus())
				.body(apiResponse);
	}
}
