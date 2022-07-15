package com.eccomerce.userservices.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eccomerce.userservices.dto.UserDto;
import com.eccomerce.userservices.exception.UserException;
import com.eccomerce.userservices.service.UserService;



@RestController
public class UserController {
	@Autowired
	UserService userService;
	
	
	
	@PostMapping("/user/signup")
	public ResponseEntity<UserDto> registerUser(@RequestBody @Valid UserDto userDto) throws UserException{
	return new ResponseEntity<>(userService.signUp(userDto),HttpStatus.CREATED);
	}
	
	
	
	@GetMapping("/user/{userId}")
	public ResponseEntity<UserDto> getUserDetail(@PathVariable("userId") String id)throws UserException{
	return new ResponseEntity<>(userService.userDetails(id),HttpStatus.OK);
	}
	
	
	@PutMapping("user/{userId}")
	public ResponseEntity<UserDto> editUser(@PathVariable("userId") String id,@RequestBody UserDto userDto) throws UserException{
	return new ResponseEntity<>((userService.editUserDetails(id, userDto)),HttpStatus.OK);
	}
	
	
	
	@DeleteMapping("user/{userId}")
	public ResponseEntity<String> deleteUser(@PathVariable("userId") String id) throws UserException{
	userService.deleteUserDetails(id);
	return new ResponseEntity<>("user is deleted successfully!!",HttpStatus.OK);
	}
	
	
	
	@GetMapping("/user")
	public ResponseEntity<List<UserDto>> getAllUserDetail(){
	return new ResponseEntity<>(userService.getAllUserDetails(),HttpStatus.OK);
	}
}
