package net.sparkminds.user.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.sparkminds.user.dto.UserRequestDto;
import net.sparkminds.user.entity.User;
import net.sparkminds.user.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	private final UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	
	@GetMapping
	public ResponseEntity<List<User>> getUser () {
		return ResponseEntity.ok().body(userService.getAllUser());
	}
	
	@PostMapping 
	public ResponseEntity<User> createUser(@RequestBody UserRequestDto userRequestDto) {
		User user = userService.createUser(userRequestDto);
		return ResponseEntity.ok(user);
	}
	
	@PutMapping
	public ResponseEntity<?> updateUser(@RequestBody UserRequestDto userRequestDto, @PathVariable("id") Long id ) {
		userService.updateUser(userRequestDto, id);
		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping
	public ResponseEntity<?> deleteUser(@PathVariable("id") Long id) {
		userService.deleteUser(id);
		return ResponseEntity.noContent().build();
		
	}
}
