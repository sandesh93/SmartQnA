package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.restclient.LoginRestClientUtil;

@Controller
public class LoginRequestController {
	
	LoginRestClientUtil restcliient = new LoginRestClientUtil();
	
	@RequestMapping("/registerUser")
	public String addUser(User user) {	 
		System.out.println("register page");
		restcliient.addUser(user);
		return "home.jsp";
	 }
	
	@PostMapping("/LoginUser")
	 public String loginUser(@RequestBody User user) {	 
		
		return "OK";
	 }
	
}
