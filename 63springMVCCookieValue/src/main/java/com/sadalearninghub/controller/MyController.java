package com.sadalearninghub.controller;

import java.util.Arrays;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("/home")
    public String handle (Model model, HttpServletRequest request, HttpServletResponse response) {
		Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            Arrays.stream(cookies)
                  .forEach(c -> System.out.println(c.getName() + "=" + c.getValue()));
        }

        Cookie newCookie = new Cookie("testCookie", "testCookieValue");
        newCookie.setMaxAge(24 * 60 * 60);
        response.addCookie(newCookie);

        model.addAttribute("msg", "This is from index.jsp");
        return "index";

    }
	
	@RequestMapping("index1")
    public String handleRequest (
                        @CookieValue(value = "testCookie",
                                            defaultValue = "defaultCookieValue")
                        String cookieValue, Model model) {
        System.out.println(cookieValue);
        model.addAttribute("cookieValue", cookieValue);

        return "index1";
    }



}
