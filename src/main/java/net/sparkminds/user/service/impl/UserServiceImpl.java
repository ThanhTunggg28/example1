package net.sparkminds.user.service.impl;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import net.sparkminds.user.dto.UserRequestDto;
import net.sparkminds.user.entity.User;
import net.sparkminds.user.repository.UserRepository;
import net.sparkminds.user.service.UserService;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	@Transactional
	public User createUser(UserRequestDto userRequestDto) {
		User user = new User();
		user.setFirstName(userRequestDto.getFirstName());
		user.setLastName(userRequestDto.getLastName());
		user.setEmail(userRequestDto.getEmail());
		user.setPassword(userRequestDto.getPassword());
		user.setAddress(userRequestDto.getAddress());
		user.setPhone(userRequestDto.getPhone());

		return userRepository.save(user);
	}
	public List<User> getAllUser() {
		return userRepository.findAll();
	}
	
	public void updateUser(UserRequestDto userRequestDto, Long id) {
		User user = userRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("User is not exist"));
		user.setFirstName(userRequestDto.getFirstName());
		user.setLastName(userRequestDto.getLastName());
		user.setEmail(userRequestDto.getEmail());
		user.setPassword(userRequestDto.getPassword());
		user.setAddress(userRequestDto.getAddress());
		user.setPhone(userRequestDto.getPhone());
	}
	public void deleteUser(Long id) {
		User user = userRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("User is not exist"));
		userRepository.delete(user);
	}

}
