package com.sadalearninghub.RSpringSetterInjection;

import java.util.Set;

public class SetBean {
	
	private Set<String> mySet;
	private Set<Student1> myStudents;
	
	public void setMyStudents(Set<Student1> myStudents) {
		this.myStudents = myStudents;
	}
	
	public void setMySet(Set<String> mySet) {
		this.mySet = mySet;
	}
	public void show() {
		System.out.println("MySet values: "+mySet);
	}
	
	public void disMySet() {
		for(Student1 s: myStudents)
			System.out.println(s.toString());
	}

}
