package com.sadalearninghub.RSpringMVCLoginWithCommandClass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sadalearninghub.RSpringMVCLoginWithCommandClass.dto.Login;

@Controller
public class LoginController {
	
	@RequestMapping("login")
	public ModelAndView getLoginPage() {
		return new ModelAndView("login", "command", new Login());
	}
	
	@RequestMapping(value="loginCheck", method=RequestMethod.POST)
	public ModelAndView verifyLogin(@ModelAttribute Login login, BindingResult result) {
		if(login.getUname().equals("Rajesh") && login.getPwd().equals("Rajesg@123")) {
			return new ModelAndView("success", "msg","LoginSuccess");
		}else {
			return new ModelAndView("failure", "msg", "LoginFailure");
		}
	}

}
