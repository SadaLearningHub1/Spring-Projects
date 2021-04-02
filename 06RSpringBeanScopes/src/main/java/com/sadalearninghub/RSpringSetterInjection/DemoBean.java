package com.sadalearninghub.RSpringSetterInjection;

public class DemoBean {
	private String str;
	public void SetStr(String str) {
		this.str = str;
	}
	
	public void show() {
		System.out.println("str value: "+str);
	}

}
