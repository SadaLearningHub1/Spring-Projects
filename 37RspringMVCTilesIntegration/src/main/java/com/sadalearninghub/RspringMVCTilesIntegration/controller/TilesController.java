package com.sadalearninghub.RspringMVCTilesIntegration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TilesController {
	@RequestMapping("welcome")
	public ModelAndView wel() {
		return new ModelAndView("welcome");
	}
	
	@RequestMapping("friends")
	public ModelAndView fri() {
		return new ModelAndView("friends");
	}
	
	@RequestMapping("office")
	public ModelAndView off() {
		return new ModelAndView("office");
	}
}
