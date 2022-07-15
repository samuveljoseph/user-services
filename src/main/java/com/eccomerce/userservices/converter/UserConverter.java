package com.eccomerce.userservices.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.eccomerce.userservices.dto.UserDto;
import com.eccomerce.userservices.model.User;



@Component
public class UserConverter {
	public List<UserDto> userToDto(List<User> user){
		return user.stream().map(this::userToDto).collect(Collectors.toList());
	}
	public  UserDto userToDto(User user) {
		UserDto dto=new UserDto();
		dto.setId(user.getId());
		dto.setEmailId(user.getEmailId());
		dto.setFirstName(user.getFirstName());
		dto.setAddress(user.getAddress());
		dto.setLastName(user.getLastName());
		dto.setPassword(user.getPassword());
		dto.setUserName(user.getUserName());
		return dto;
		
	}
	public User dtoToUser(UserDto userDto) {
		User user=new User();
		user.setEmailId(userDto.getEmailId());
		user.setFirstName(userDto.getFirstName());
		user.setAddress(userDto.getAddress());
		user.setLastName(userDto.getLastName());
		user.setPassword(userDto.getPassword());
		user.setUserName(userDto.getUserName());
		return user;
	}
	public User dtoToUserUpdate(UserDto userDto,User user) {
		user.setFirstName(userDto.getFirstName());
		user.setAddress(userDto.getAddress());
		user.setLastName(userDto.getLastName());
		return user;
	}
}
