package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.User;
import com.example.demo.dao.UserRepo;

@RestController
public class UserController {
	@Autowired
	UserRepo repo;

	@PostMapping("/user")
	public void addUser(User user) {
		repo.save(user);
		System.out.println("user = "+user );
	}
}