package com.sadalearninghub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.sadalearninghub.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	/*
	 * Get user from session attribute
	 */
	@GetMapping("/info")
	public String userInfo(@SessionAttribute("student") Student student) {

		System.out.println("Email: " + student.getEmail());
		System.out.println("First Name: " + student.getFname());

		return "student";
	}


}
