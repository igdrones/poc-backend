package com.it.ig.tech.poc.service;

import java.util.List;

import com.it.ig.tech.poc.entity.User;

public interface UserService {

	public User saveUser(User userRequest);
	
	public List<User> getAllUser();
	
	public User getUserById(Integer id);
}
