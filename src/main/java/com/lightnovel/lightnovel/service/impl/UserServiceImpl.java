package com.lightnovel.lightnovel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lightnovel.lightnovel.data.dao.UserDAO;
import com.lightnovel.lightnovel.data.model.User;
import com.lightnovel.lightnovel.service.UserService;
import com.lightnovel.lightnovel.service.model.UserDTO;
import com.lightnovel.lightnovel.util.DozerHelper;

@Service("UserService")
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO dao;
	
	@Autowired
	private DozerHelper mapper;
	
	
	public UserDAO getDao() {
		return dao;
	}

	public void setDao(UserDAO dao) {
		this.dao = dao;
	}

	public List<UserDTO> findAll() {
		List<UserDTO> listOfUsers = mapper.map(dao.findAll(), UserDTO.class);
		return listOfUsers;
	}
	
	
	public boolean save(UserDTO userDTO){
		User user = mapper.map(userDTO, User.class);
		return dao.save(user);
	}

}
