package com.sadalearninghub.RSpringSetterInjection;

import java.util.List;

public class ListBean {
	
	private List<String> myList;
	private List<Student> myStudents;
	
	public void setMyList(List myList) {
		this.myList = myList;
	}
	
	public void setMyStudents(List<Student> myStudents) {
		this.myStudents = myStudents;
	}
	
	public void display() {
		System.out.println("List values: "+ myList);
	}
	
	public void showListStudents() {
		for(Student s: myStudents) {
			System.out.println(s.toString());
		}
	}

}
