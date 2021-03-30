package com.sadalearninghub.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sadalearninghub.domain.Student;

@Service
public class StudentService {
	public List<Student> getAllStudent() {
		   List<Student> list = new ArrayList();
		   list.add(new Student(1, "Mahesh"));
		   list.add(new Student(2, "Ram"));
		   list.add(new Student(3, "Krishna"));
		   return list;
	   }

}
