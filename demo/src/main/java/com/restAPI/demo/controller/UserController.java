package com.restAPI.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restAPI.demo.model.User;

@RestController
@RequestMapping("/user")
public class UserController {

	private User userService;
	
	@GetMapping("{userID}")
	public User getUserDetails(String userID) {
		
		/* this is where we would go to the DB */
		return this.userService;
		
	}
	
	@PostMapping
	public String createUserDetails(@RequestBody User user) {
		this.userService = user;
		
		return "User created successfully";
	}
	
	@PutMapping
	public String updateUserDetails(@RequestBody User updatedUser) {
		this.userService = updatedUser;
		
		return "User Updated successfully";
	}
	
	@DeleteMapping("{userID}")
	public String deleteUserDetails(String userID) {
		this.userService = null;
		return "User deleted succesfully";
	}
	
	
}
