package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GatewayController {
	LoginRequestController login = new LoginRequestController();
	
	@RequestMapping("home")
	public ModelAndView home(String name) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("name",name);
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/LoginRegister")
	public void register(User user) {	
		
	}
	
	@RequestMapping("/Login")
	public void login() {
		
	}
}
