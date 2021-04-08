package com.sadalearninghub;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClient {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		B b = (B) context.getBean("id1");
		b.show();
		
		B b1 = (B) context.getBean("id3");
		TestBean tb = (TestBean) context.getBean("id2");
		
		System.out.println("Completed!!!");
		
	}

}
