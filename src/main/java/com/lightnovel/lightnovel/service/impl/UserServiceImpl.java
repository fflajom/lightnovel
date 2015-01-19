package com.lightnovel.lightnovel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lightnovel.lightnovel.data.UserDao;
import com.lightnovel.lightnovel.data.model.User;
import com.lightnovel.lightnovel.service.UserService;

@Service("UserService")
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao dao;
	
	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	public List<User> findAll() {
		return dao.findAll();
	}
	
	
	public boolean save(User user){
		return dao.save(user);
	}

}
