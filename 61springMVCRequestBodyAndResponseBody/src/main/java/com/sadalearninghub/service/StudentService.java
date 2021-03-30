package com.sadalearninghub.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sadalearninghub.dao.Student;


public interface StudentService {
	void saveStudent(Student student);

    List<Student> getAllStudent();


}
