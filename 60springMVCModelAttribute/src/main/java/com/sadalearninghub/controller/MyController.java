package com.sadalearninghub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sadalearninghub.model.Message;

@Controller
public class MyController {
	@RequestMapping(value = "/submit", method = RequestMethod.POST)
    public String submit(@ModelAttribute("msg") Message msg, ModelMap model) {
        model.addAttribute("msg", msg);
        return "display";
    }
}
