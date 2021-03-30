package com.sadalearninghub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
	@RequestMapping("/")
    @ResponseBody
    public String handle (@RequestAttribute("count") Integer counter) {
        return String.format("Visitor number: %d", counter);
    }


}
