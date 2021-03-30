package com.sadalearninghub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.sadalearninghub.dao.Student;
import com.sadalearninghub.service.StudentService;

@Controller
@RequestMapping("/student")
public class MyController {

	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "register", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
	public void handleJsonPostRequest (@RequestBody Student student, Model model) {
		System.out.println("saving student: "+student);
		studentService.saveStudent(student);
	}

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<Student> handleAllUserRequest () {
		return studentService.getAllStudent();
	}



}
