package com.lightnovel.lightnovel.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import com.lightnovel.lightnovel.service.model.ReaderDTO;
import com.lightnovel.lightnovel.service.model.UserDTO;

@ContextConfiguration(
        locations = {"classpath:/applicationContext.xml"})
public class ReaderServiceTest extends AbstractTransactionalJUnit4SpringContextTests{
	
	@Autowired
	ReaderService readerService;
	
	@Test
	public void find(){
					
		ReaderDTO reader = readerService.getReader(new Long(1));
		
		System.out.println("Name :" + reader.getFname() + " " + reader.getMname() + ", " + reader.getLname());
		System.out.println("Followers :");
		
		for(UserDTO user : reader.getFollowers()){
			System.out.println(user.getFname() + " " + user.getMname() + ", " + user.getLname());
		}
		System.out.println("Following :");
		for(UserDTO user : reader.getFollowing()){
			System.out.println(user.getFname() + " " + user.getMname() + ", " + user.getLname());
		}
		
	}
}
