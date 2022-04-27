package net.sparkminds.user.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import net.sparkminds.user.entity.User;
import net.sparkminds.user.repository.UserRepository;

public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	//Get
	public List<User> getUser(){
		List<User> userList = new ArrayList<>();
		userRepository.findAll().forEach(user -> userList.add(user));
		return userList;
		
	}
	

}
