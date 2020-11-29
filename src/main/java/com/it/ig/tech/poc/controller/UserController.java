package com.it.ig.tech.poc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.it.ig.tech.poc.entity.User;
import com.it.ig.tech.poc.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

	@GetMapping
	public ResponseEntity<String> welcomeUser()
	{
		return new ResponseEntity<String>("Welcome to Java Poc application", HttpStatus.OK);
	}
	
	@GetMapping(value = "/user")
	public ResponseEntity<List<User>> getAllUser()
	{
		List<User> response = userService.getAllUser();
		return new ResponseEntity<List<User>>(response, HttpStatus.OK);
	}
	
	@GetMapping(value = "/user/{id}")
	public ResponseEntity<User> getUserById(@PathVariable Integer id)
	{
		User response = userService.getUserById(id);
		return new ResponseEntity<User>(response, HttpStatus.OK);
	}
	
	@PostMapping(value = "/user")
	public ResponseEntity<User> saveUser(@RequestBody User request) {
		User response = userService.saveUser(request);
		return new ResponseEntity<User>(response, HttpStatus.OK);
		
	}
}
