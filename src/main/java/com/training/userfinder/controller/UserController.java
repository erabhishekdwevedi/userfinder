package com.training.userfinder.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.training.userfinder.dao.UserDAO;
import com.training.userfinder.model.User;

@RestController
@RequestMapping("/userfinder")
public class UserController {

	@Autowired
	UserDAO userDAO;

	@PostMapping(path="/createuser",consumes="application/json", produces = "application/json")
	public User createUser(@Valid @RequestBody User user) {
		return userDAO.create(user);

	}

	@GetMapping("/listusers")
	public List<User> findUsers() {
		return userDAO.findAll();

	}

	@GetMapping("/finduser/{id}")
	public ResponseEntity<User> findUserById(@PathVariable(value = "id") Long userid) {

		User user = userDAO.findOne(userid);
		if (user == null) {

			return ResponseEntity.notFound().build();

		}
		if (user != null) {

			return ResponseEntity.ok().body(user);

		}
		return null;

	}

	@PutMapping("/updateuser/{id}")
	public ResponseEntity<User> updateUser(@PathVariable(value = "id") Long userid,
			@Valid @RequestBody User userdetails) {

		User user = userDAO.findOne(userid);

		if (user == null) {
			return ResponseEntity.notFound().build();
		}

		user.setName(userdetails.getName());

		User updateUser = userDAO.create(user);

		return ResponseEntity.ok().body(user);
	}
	
	@DeleteMapping("/deleteuser/{id}")
	public ResponseEntity<User> deleteUser(@PathVariable(value = "id") Long userid) {
		
		User user = userDAO.findOne(userid);
		
		if (user == null) {
			return ResponseEntity.notFound().build();
		}
		
		userDAO.delete(user);
		return ResponseEntity.ok().build();

		
		
		
	}
}
