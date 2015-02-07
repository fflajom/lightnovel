package com.lightnovel.lightnovel.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lightnovel.lightnovel.data.dao.UserDAO;
import com.lightnovel.lightnovel.service.ReaderService;
import com.lightnovel.lightnovel.service.model.ReaderDTO;
import com.lightnovel.lightnovel.util.DozerHelper;

@Service("ReaderService")
@Transactional
public class ReaderServiceImpl implements ReaderService{

	@Autowired
	UserDAO dao;
	
	@Autowired
	private DozerHelper mapper;
	
	public ReaderDTO getReader(Long id) {
		return mapper.map(dao.find(id), ReaderDTO.class);
	}

}
