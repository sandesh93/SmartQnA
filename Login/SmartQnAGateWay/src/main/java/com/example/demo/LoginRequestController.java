package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

public class LoginRequestController {
	
	@Autowired
	 RestTemplate restTemplate;
	
	@PostMapping("/register")
	 public String postAvailability(@RequestBody User user) {	 
	 ResponseEntity<String> response = restTemplate.postForEntity("/register", user, String.class);
	 return response.getBody();
	 }
}
