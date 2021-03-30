package com.sadalearninghub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.sadalearninghub.model.Student;

@Controller
@SessionAttributes("student")
public class MyController {

	@ModelAttribute("student")
	public Student setUpStudentForm() {
		return new Student();
	}

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@PostMapping("/dologin")
	public String doLogin(@ModelAttribute("student") Student student, Model model) {
		// Implement your business logic
		if (student.getEmail().equals("sadalearninghub") && student.getPassword().equals("sada")) {
			// Set user dummy data
			student.setFname("sadalearninghub");
			student.setMname("Youtube ");
			student.setLname("Channel");
			student.setAge(2);
		} else {
			model.addAttribute("message", "Login failed. Try again.");
			return "index";
		}
		return "success";
	}




}
