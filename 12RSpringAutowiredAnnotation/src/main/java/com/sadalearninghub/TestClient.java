package com.sadalearninghub;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClient {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		OnlyOne oo = (OnlyOne) context.getBean("oo");
		OnlyOne oo1 = (OnlyOne) context.getBean("oo");
		OnlyOne oo2 = (OnlyOne) context.getBean("oo");
		OnlyOne oo3 = (OnlyOne) context.getBean("oo");
		System.out.println("Completed!!!");
		
	}

}
