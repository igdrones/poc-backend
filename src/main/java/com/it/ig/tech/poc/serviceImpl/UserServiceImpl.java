package com.it.ig.tech.poc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.ig.tech.poc.entity.User;
import com.it.ig.tech.poc.repo.UserRepo;
import com.it.ig.tech.poc.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepo userRepo;
	
	@Override
	public List<User> getAllUser() {
		return userRepo.findAll();
	}
	
	@Override
	public User getUserById(Integer id) {
		return userRepo.findById(id).orElse(null);
	}
	
	@Override
	public User saveUser(User request) {
		return userRepo.save(request);
	}

}
