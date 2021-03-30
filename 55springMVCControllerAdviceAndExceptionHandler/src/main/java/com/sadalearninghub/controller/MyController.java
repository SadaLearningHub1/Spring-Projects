package com.sadalearninghub.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	
	@RequestMapping("/test1")
    public String handleRequest1 () throws Exception {
        String msg = String.format("Test exception from class: %s", this.getClass().getSimpleName());
        throw new Exception(msg);
    }
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		return "index";
	}


}
