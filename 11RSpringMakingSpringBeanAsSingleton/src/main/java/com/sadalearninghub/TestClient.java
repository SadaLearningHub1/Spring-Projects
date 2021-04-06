package com.sadalearninghub;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClient {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		InstrumentList oo = (InstrumentList) context.getBean("iml");
		oo.show();
		System.out.println("Completed!!!");
		
	}

}
