package com.sadalearninghub.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sadalearninghub.dao.Student;
import com.sadalearninghub.service.StudentService;

@Controller
@RequestMapping("/register")
public class MyController {
	
	@Autowired
    private StudentService studentService;


    @InitBinder("student")
    public void customizeBinding (WebDataBinder binder) {
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
        dateFormatter.setLenient(false);
        binder.registerCustomEditor(Date.class, "dateOfBirth",
                                    new CustomDateEditor(dateFormatter, true));
    }
    

    @RequestMapping(method = RequestMethod.GET)
    public String handleGetRequest (Model model) {
        model.addAttribute("student", new Student());
        return "index";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String handlePostRequest (@Valid @ModelAttribute("student") Student student,
                                     BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "index";
        }

        studentService.saveStudent(student);
        model.addAttribute("students", studentService.getAllStudent());
        return "AllStudents";
    }


}
