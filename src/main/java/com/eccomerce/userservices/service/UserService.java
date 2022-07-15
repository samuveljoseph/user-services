package com.eccomerce.userservices.service;

import java.util.List;

import com.eccomerce.userservices.dto.UserDto;
import com.eccomerce.userservices.exception.UserException;



public interface UserService {
	public UserDto signUp(UserDto userDto) throws UserException;
	public UserDto editUserDetails(String id,UserDto userDto) throws UserException;
	public void deleteUserDetails(String id) throws UserException;
	public UserDto userDetails(String id) throws UserException;
	public List<UserDto> getAllUserDetails();
}
