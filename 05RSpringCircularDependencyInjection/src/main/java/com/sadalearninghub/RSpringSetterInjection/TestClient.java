package com.sadalearninghub.RSpringSetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClient {

	public static void main(String[] args) {
		//Circular Dependency Injection
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		DemoBeanA a = (DemoBeanA) context.getBean("id1");
	}

}
