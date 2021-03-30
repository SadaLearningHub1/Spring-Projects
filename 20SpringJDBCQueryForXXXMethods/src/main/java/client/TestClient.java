package client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import business.DemoBean;

public class TestClient {
	public static void main(String args[]) throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Object o=ctx.getBean("db");
		DemoBean db = (DemoBean)o;
		db.findByCustomerId(1);
		System.out.println("===============================");
		db.findAllCustomers();
	}

}
