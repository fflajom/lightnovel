package com.lightnovel.lightnovel.service;

import java.util.List;

import com.lightnovel.lightnovel.service.model.UserDTO;

public interface UserService {

		List<UserDTO> findAll();
		boolean save(UserDTO user);
}
