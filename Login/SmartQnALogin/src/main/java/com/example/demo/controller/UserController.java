package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.User;
import com.example.demo.dao.UserRepo;

@Controller
public class UserController {
	
	UserRepo repo;
	
	@RequestMapping("/register")
	public Boolean registerUser(User user) {
		repo.save(user);
		return true;	
	}
}
