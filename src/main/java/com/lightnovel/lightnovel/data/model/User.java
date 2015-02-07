package com.lightnovel.lightnovel.data.model;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class User extends BaseModel {

	private static final long serialVersionUID = 1L;

	@Column(name="username", nullable=false, unique=true, length=20)
	private String username;
	
	@Column(name="password", nullable=false, length=50)
	private String password;
	
	@Column(name="salt", nullable=false, length=50)
	private String salt;
	
	@Column(name="email", nullable=false, unique=true, length=254)
	private String email;
	
	@Column(name="first_name", nullable=false, length=35)
	private String firstName;
	
	@Column(name="middle_name", nullable=true, length=35)
	private String middleName;
	
	@Column(name="last_name", nullable=false, length=35)
	private String lastName;
	
	@Column(name="birthdate", nullable=false)
	private Date birthdate;
	
	@Column(name="user_type", nullable=false, length=11)
	private String userType;
	
	@Column(name="is_active", nullable=false)
	private boolean isActive;
	
	@Column(name="premium_date", nullable=true)
	private Timestamp premiumDate;
	
	@Column(name="registration_date", nullable=false)
	private Timestamp registrationDate;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Date getPremiumDate() {
		return premiumDate;
	}

	public void setPremiumDate(Timestamp premiumDate) {
		this.premiumDate = premiumDate;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Timestamp registrationDate) {
		this.registrationDate = registrationDate;
	}
	
}
