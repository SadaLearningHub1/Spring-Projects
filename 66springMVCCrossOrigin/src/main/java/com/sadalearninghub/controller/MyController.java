package com.sadalearninghub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sadalearninghub.domain.Student;
import com.sadalearninghub.service.StudentService;

@CrossOrigin(origins = {"http://localhost:8585"}, maxAge = 4800, allowCredentials = "false")
@RestController
@RequestMapping("info")
public class MyController {
	
	@Autowired
	private StudentService service;
	
	
	@CrossOrigin(origins = {"http://localhost:8787"}, maxAge = 6000)
	@RequestMapping("home")
	public String showData() {
		List<Student> list = service.getAllStudent();
		return list.toArray().toString();
 	}
	
	@RequestMapping("nexthome")
	public String showDataNext() {
		List<Student> list = service.getAllStudent();
		return list.toArray().toString();
 	}
}
