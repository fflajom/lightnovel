package com.lightnovel.lightnovel.service.model;

import java.util.List;

public class ReaderDTO extends UserDTO{

	private List<UserDTO> followers;
	private List<UserDTO> following;
	
	public List<UserDTO> getFollowers() {
		return followers;
	}
	public List<UserDTO> getFollowing() {
		return following;
	}

	public void setFollowers(List<UserDTO> followers) {
		this.followers = followers;
	}

	public void setFollowing(List<UserDTO> following) {
		this.following = following;
	}
	
	
}
