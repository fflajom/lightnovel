package com.lightnovel.lightnovel.service;

import java.util.List;

import com.lightnovel.lightnovel.data.model.User;

public interface UserService {

		List<User> findAll();
		boolean save(User user);
}
