package com.sadalearninghub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sadalearninghub.model.Message;

@Controller
public class IndexPageController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index(Model model) {
		return new ModelAndView("index","msg",new Message());
	}

}
