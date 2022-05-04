package net.sparkminds.user.service;

import net.sparkminds.user.dto.RegisterRequestDto;
import net.sparkminds.user.entity.User;

public interface RegisterService {
	User register(RegisterRequestDto registerRequestDto);
}
