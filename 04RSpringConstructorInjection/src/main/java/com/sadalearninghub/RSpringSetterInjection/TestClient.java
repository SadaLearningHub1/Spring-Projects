package com.sadalearninghub.RSpringSetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClient {

	public static void main(String[] args) {
		//<Constructor-arg>
		//1. type, 2. name, 3. index, 4. value, 5. ref
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		DemoBean db = (DemoBean) context.getBean("id1");
		//DemoBean db = new DemoBean("Rajesh", "password");
		db.disp();
		
		
		StudentBean sb = (StudentBean) context.getBean("id4");
		//StudentBean sb = new StudentBean(new Student(1, "Rajesh"));
		sb.show();
	}

}
