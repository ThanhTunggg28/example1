package net.sparkminds.user.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import net.sparkminds.user.dto.ShowInforRequsetDto;
import net.sparkminds.user.entity.User;
import net.sparkminds.user.repository.UserRepository;
import net.sparkminds.user.service.ShowInforService;


@RestController
public class ShowInforController {
	
	
	@Autowired
	private UserRepository userReposiroty;
	

	@GetMapping(value="/infor")
	public List<ShowInforRequsetDto> ShowInfor() {
		
	
		List<User> users = userReposiroty.findAll();
		
		List<ShowInforRequsetDto> result = new ArrayList<>();
		
		for(User user : users) {
			result.add(ShowInforService.showInfor(user));
		}
		return result;
	}

}
