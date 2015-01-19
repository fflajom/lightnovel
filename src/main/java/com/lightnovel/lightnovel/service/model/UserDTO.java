package com.lightnovel.lightnovel.service.model;

import java.util.Date;

import com.lightnovel.lightnovel.data.model.User;

public class UserDTO {
	
	private String username;
	private String fname;
	private String mname;
	private String lname;
	private Date birthdate;
	private boolean isPremium;
	private String type;
	//create age getter
	
	public UserDTO(User user){
		this.username = user.getUsername();
		this.fname = user.getFname();
		this.mname = user.getMname();
		this.lname = user.getLname();
		this.birthdate = user.getBirthdate();
		this.isPremium = user.isPremium();
		this.type = user.getType();
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public boolean isPremium() {
		return isPremium;
	}
	public void setPremium(boolean isPremium) {
		this.isPremium = isPremium;
	}
}
