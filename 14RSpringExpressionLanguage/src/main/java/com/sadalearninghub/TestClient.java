package com.sadalearninghub;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClient {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		Book b = (Book) context.getBean("id2");
		b.show();
		
		
		TestBean1 tb1 = (TestBean1) context.getBean("id3");
		tb1.Disp();
		
		NumberGuss ng = (NumberGuss) context.getBean("id5");
		ng.show();
		
		NumberGuss ng1 = (NumberGuss) context.getBean("id5");
		ng1.show();
		
		InstrumentList il = (InstrumentList) context.getBean("id6");
		il.showSong();
		
		InstrumentList il1 = (InstrumentList) context.getBean("id7");
		il1.showSong();
		
		System.out.println("Completed!!!");
		
	}

}
