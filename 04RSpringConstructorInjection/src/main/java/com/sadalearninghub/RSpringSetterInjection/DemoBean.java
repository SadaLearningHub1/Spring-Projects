package com.sadalearninghub.RSpringSetterInjection;

public class DemoBean {
	private String uname, pwd;

	public DemoBean(String uname, String pwd) {
		this.uname = uname;
		this.pwd = pwd;
	}
	
	public void disp() {
		System.out.println("User Name: "+ uname);
		System.out.println("Password: "+ pwd);
	}
	

}
