package com.eccomerce.userservices.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import com.eccomerce.userservices.model.Address;



public class UserDto {
	private String id;
	@NotNull(message="firstName shouldn't be null ")
	private String firstName;
	@NotNull(message="lastName shouldn't be null ")
	private String lastName;
	@NotNull(message="username shouldn't be null ")
	private String userName;
	@Email(message="invalid email address")
	private String emailId;
	@NotNull(message="password shouldn't be null ")
	private String password;
	private Address address;
	public String getId() {
	return id;
	}
	public void setId(String id) {
	this.id = id;
	}
	public String getFirstName() {
	return firstName;
	}
	public void setFirstName(String firstName) {
	this.firstName = firstName;
	}
	public String getLastName() {
	return lastName;
	}
	public void setLastName(String lastName) {
	this.lastName = lastName;
	}
	public String getUserName() {
	return userName;
	}
	public void setUserName(String userName) {
	this.userName = userName;
	}
	public String getEmailId() {
	return emailId;
	}
	public void setEmailId(String emailId) {
	this.emailId = emailId;
	}
	public String getPassword() {
	return password;
	}
	public void setPassword(String password) {
	this.password = password;
	}
	public Address getAddress() {
	return address;
	}
	public void setAddress(Address address) {
	this.address = address;
	}
	public UserDto(String id, String firstName, String lastName, String userName, String emailId, String password,
	Address address) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.userName = userName;
	this.emailId = emailId;
	this.password = password;
	this.address = address;
	}
	public UserDto() {
	super();
	}
}
