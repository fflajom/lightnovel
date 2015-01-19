package com.lightnovel.lightnovel.service.model;

import java.util.ArrayList;
import java.util.List;

import com.lightnovel.lightnovel.data.model.User;

public class ReaderDTO extends UserDTO{

	private List<UserDTO> followers;
	private List<UserDTO> following;
	
	public ReaderDTO(User user){
		super(user);
		this.followers = new ArrayList<UserDTO>();
		this.following = new ArrayList<UserDTO>();
		
		for(User follower : user.getFollowers()){
			this.followers.add(new UserDTO(follower));
		}
		
		for(User following : user.getFollowing()){
			this.following.add(new UserDTO(following));
		}
	}
	
	public List<UserDTO> getFollowers() {
		return followers;
	}
	public List<UserDTO> getFollowing() {
		return following;
	}
	
	
}
