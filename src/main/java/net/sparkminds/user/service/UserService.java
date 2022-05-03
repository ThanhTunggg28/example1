package net.sparkminds.user.service;

import java.util.List;

import net.sparkminds.user.dto.UserRequestDto;
import net.sparkminds.user.entity.User;

public interface UserService {
	User createUser(UserRequestDto userRequestDto);

	List<User> getAllUser();

	void updateUser(UserRequestDto userRequestDto, Long id);

	void deleteUser(Long id);

}
