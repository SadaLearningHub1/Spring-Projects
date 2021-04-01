package com.sadalearninghub.RSpringSetterInjection;

public class StudentBean {
	private Student student;

	public StudentBean(Student student) {
		this.student = student;
	}
	
	public void show() {
		System.out.println(student.toString());
	}
	

}
