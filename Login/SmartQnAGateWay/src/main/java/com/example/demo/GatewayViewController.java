package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GatewayViewController {

	@RequestMapping("home")
	public ModelAndView home(String name) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("name",name);
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/register")
	public ModelAndView register(User user) {	
		ModelAndView mv = new ModelAndView();
		mv.setViewName("register");
		return mv;
	}
	
	@RequestMapping("/login")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		return mv;		
	}
}
