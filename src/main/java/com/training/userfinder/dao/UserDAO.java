package com.training.userfinder.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.userfinder.model.User;
import com.training.userfinder.repository.UserRepository;

@Service
public class UserDAO {

	@Autowired
	UserRepository userRepository ;
	
	
	//Create
	public User create(User user) {
		return userRepository.save(user);
	}
	
	
	//Read
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	public User findOne(Long id) {
		return userRepository.findOne(id);
	}
	
	public void delete(User user) {
		userRepository.delete(user);
	}
	
}
