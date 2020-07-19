package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.User;

@RestController
public class UserController {

	@PostMapping("/user")
	public void addUser(User user) {
		System.out.println("user = "+user );
	}
}

