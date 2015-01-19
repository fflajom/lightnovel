package com.lightnovel.lightnovel.data.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID", nullable=false, unique=true, length=11)
	private Long id;
	
	@Column(name="username", nullable=false, unique=true, length=45)
	private String username;
	
	@Column(name="salted_password", nullable=false)
	private String saltedPassword;
	
	@Column(name="salt", nullable=false)
	private String salt;
	
	@Column(name="fname", nullable=false)
	private String fname;
	
	@Column(name="mname", nullable=false)
	private String mname;
	
	@Column(name="lname", nullable=false)
	private String lname;
	
	@Column(name="birthdate", nullable=false)
	private Date birthdate;
	
	@Column(name="type", nullable=false)
	private String type;
	
	@Column(name="is_premium", nullable=false)
	private boolean isPremium;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "Followers", joinColumns = { 
			@JoinColumn(name = "Follower", nullable = false, updatable = false) }, 
			inverseJoinColumns = { @JoinColumn(name = "User", 
					nullable = false, updatable = false) })
	public List<User> following = new ArrayList<User>();
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "following")
	private List<User> followers = new ArrayList<User>();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSaltedPassword() {
		return saltedPassword;
	}
	public void setSaltedPassword(String saltedPassword) {
		this.saltedPassword = saltedPassword;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isPremium() {
		return isPremium;
	}
	public void setPremium(boolean isPremium) {
		this.isPremium = isPremium;
	}
	public List<User> getFollowing() {
		return following;
	}
	public void setFollowing(List<User> following) {
		this.following = following;
	}
	public List<User> getFollowers() {
		return followers;
	}
	public void setFollowers(List<User> followers) {
		this.followers = followers;
	}
	@Override
	public String toString() {
		return "User [fname=" + fname + ", mname=" + mname + ", lname=" + lname
				+ "]";
	}
	
}
