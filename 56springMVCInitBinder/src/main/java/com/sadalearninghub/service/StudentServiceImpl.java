package com.sadalearninghub.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.sadalearninghub.dao.Student;
@Service("studentService")
public class StudentServiceImpl implements StudentService {
	
	private Map<Long, Student> studentMap = new HashMap();


	public void saveStudent(Student student) {
		if (student.getId() == null) {
			student.setId((long) (studentMap.size() + 1));
        }
		studentMap.put(student.getId(), student);

		
	}

	public List<Student> getAllStudent() {
		return new ArrayList(studentMap.values());
	}

}
