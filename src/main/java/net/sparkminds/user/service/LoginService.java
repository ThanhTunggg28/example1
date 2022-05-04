package net.sparkminds.user.service;

import net.sparkminds.user.dto.LoginRequestDto;

public interface LoginService {

	void login(LoginRequestDto loginRequestDto);
}
