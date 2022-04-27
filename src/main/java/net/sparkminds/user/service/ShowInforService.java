package net.sparkminds.user.service;

import org.springframework.stereotype.Service;

import net.sparkminds.user.dto.ShowInforRequsetDto;
import net.sparkminds.user.entity.User;

@Service
public class ShowInforService {

	
	public static ShowInforRequsetDto showInfor(User user) {
		
		ShowInforRequsetDto showInforRequsetDto = new ShowInforRequsetDto();
		showInforRequsetDto.setFirstName(user.getFirstName());
		showInforRequsetDto.setLastName(user.getLastName());
		showInforRequsetDto.setEmail(user.getEmail());
		showInforRequsetDto.setPhone(user.getPhone());
		showInforRequsetDto.setAddress(user.getAddress());
		
		return showInforRequsetDto;
		
		
		
	}
}
