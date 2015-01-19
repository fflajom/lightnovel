package com.lightnovel.lightnovel.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lightnovel.lightnovel.data.UserDao;
import com.lightnovel.lightnovel.service.ReaderService;
import com.lightnovel.lightnovel.service.model.ReaderDTO;

@Service("ReaderService")
@Transactional
public class ReaderServiceImpl implements ReaderService{

	@Autowired
	UserDao dao;
	
	public ReaderDTO getReader(Long id) {
		return new ReaderDTO(dao.find(id));
	}

}
