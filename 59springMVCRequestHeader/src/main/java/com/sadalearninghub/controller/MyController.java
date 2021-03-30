package com.sadalearninghub.controller;

import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {


	@RequestMapping(value="/")
	public String root (Model model) {
		model.addAttribute("msg", "This Example demonistrate the @RequestHeader");
		return "index";
	}

	@RequestMapping(value="/userAgent")
	public String findUserAgent (@RequestHeader("User-Agent") String userAgent,Model model) {
		model.addAttribute("msg", "all requests, User-Agent header  : "+ userAgent);
		return "index";
	}

	@RequestMapping(value="/getuserAgentAndLng")
	public String fingUserAgentAndLng(@RequestHeader("User-Agent") String userAgent, @RequestHeader("Accept-Language") String acceptLanguage,Model map) {
		map.addAttribute("msg", "Request by User-Agent and Accept headers : " +userAgent + ", " + acceptLanguage);
		return "index";
	}
	
	@RequestMapping(value="/getAllHeadersUsingMap")
    public String findAllHeadrs (@RequestHeader Map<String, String> header,Model model) {
        model.addAttribute("msg", "Request with all headers " + header);
        return "index";
    }
	
	@RequestMapping(value="/getAllHeadersUsingClass")
    public String findAllHeadsrByHeaderClass (@RequestHeader HttpHeaders httpHeaders,Model model) {
        model.addAttribute("msg", "Request with all headers " + httpHeaders);
        return "index";
    }


}
