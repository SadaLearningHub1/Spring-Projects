package com.sadalearninghub;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClient {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		ExampleBean1 bean = (ExampleBean1) context.getBean("eb1");
		bean.showeb2();
		bean.showK();
		
	}

}
