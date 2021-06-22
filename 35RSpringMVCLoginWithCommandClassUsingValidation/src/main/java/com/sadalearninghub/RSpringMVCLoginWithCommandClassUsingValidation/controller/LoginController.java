package com.sadalearninghub.RSpringMVCLoginWithCommandClassUsingValidation.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sadalearninghub.RSpringMVCLoginWithCommandClassUsingValidation.dto.Login;

@Controller
public class LoginController {
	
	
	@RequestMapping("login")
	public ModelAndView getLoginPage() {
		return new ModelAndView("login", "log", new Login());
	}
	
	@RequestMapping(value="logincheck", method=RequestMethod.POST)
	public ModelAndView verifyLogin(@Valid @ModelAttribute("log") Login login, BindingResult result) {
		if(result.hasErrors()) {
			return new ModelAndView("login");
		}else {
			return new ModelAndView("success","msg","Login Successfull");
		}
	}

}
