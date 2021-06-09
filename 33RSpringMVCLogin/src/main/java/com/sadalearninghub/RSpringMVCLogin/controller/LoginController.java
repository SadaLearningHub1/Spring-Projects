package com.sadalearninghub.RSpringMVCLogin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping(value="check", method=RequestMethod.POST)
	public ModelAndView check(@RequestParam("uname") String userName,
			@RequestParam("pwd") String password) {
		if(userName.equals("Rajesh") && password.equals("Rajesh@123")) {
			return new ModelAndView("success","message","Login Success");
		}else {
			return new ModelAndView("login", "message", "username or password is invalid");
		}
		
	}

}
