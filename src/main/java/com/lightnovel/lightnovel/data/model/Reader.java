package com.lightnovel.lightnovel.data.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Reader extends User {

	private static final long serialVersionUID = 1L;
	
	@ManyToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinTable(
		name = "FOLLOW", 
		joinColumns = { @JoinColumn(name="follower_id", nullable=false, updatable=false) }, 
		inverseJoinColumns = { @JoinColumn(name = "following_id", nullable=false, updatable=false) }
	)
	public List<User> following = new ArrayList<User>();
	
	@ManyToMany(fetch=FetchType.LAZY, mappedBy="following")
	private List<User> followers = new ArrayList<User>();
	
	@ManyToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinTable(
		name = "SUBSCRIPTION", 
		joinColumns = { @JoinColumn(name="user_id", nullable=false, updatable=false) }, 
		inverseJoinColumns = { @JoinColumn(name = "book_id", nullable=false, updatable=false) }
	)
	private List<Book> subscriptions = new ArrayList<Book>();
	
	public List<User> getFollowing() {
		return following;
	}

	public List<User> getFollowers() {
		return followers;
	}
	
	public List<Book> getSubscriptions() {
		return subscriptions;
	}

}
