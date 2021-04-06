package com.sadalearninghub;

import org.springframework.beans.factory.annotation.Required;

public class ExampleBean1 {
	
	private ExampleBean2 eb2; //Object type
	private int k; //dependency as simple
	
	@Required
	public void setEb2(ExampleBean2 eb2) {
		this.eb2 = eb2;
	}
	
	@Required
	public void setK(int k) {
		this.k = k;
	}
	
	public void showeb2() {
		System.out.println("eb2 values is: "+eb2.m1());
	}
	public void showK() {
		System.out.println("K values : "+k);
	}
}
