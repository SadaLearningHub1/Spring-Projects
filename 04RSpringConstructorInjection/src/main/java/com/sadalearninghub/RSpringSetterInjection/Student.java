package com.sadalearninghub.RSpringSetterInjection;

public class Student {
	private int sId;
	private String sName;
	public Student(int sId, String sName) {
		this.sId = sId;
		this.sName = sName;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + "]";
	}

}
