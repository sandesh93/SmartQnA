package com.example.restclient;

import java.net.URI;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import com.example.Property.PropertyReader;
import com.example.demo.User;

public class LoginRestClientUtil {
	PropertyReader property = new PropertyReader();
	private HttpHeaders getHeaders(){ 
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		return headers;
	} 
	
	public void addUser(User user) {
		HttpHeaders headers = getHeaders();
		RestTemplate restTemplate = new RestTemplate();
		String url = property.getProperty("LoginUrl");
		HttpEntity<User> request = new HttpEntity<User>(user,headers);
		URI uri = restTemplate.postForLocation(url, request);
		System.out.println(uri.getPath());
	}
	

}
