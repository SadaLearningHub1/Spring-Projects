package client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import business.DemoBean;

public class TestClient {
	public static void main(String args[]) throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Object o=ctx.getBean("db");
		DemoBean db = (DemoBean)o;
		//db.createCustomerTable("create table Customer(id number(5) primary key, cname varchar2(10), caddr varchar2(10))");
		//db.insertCustomer(3, "Rajesh", "USA", 30);
		
		//db.updateCustomer(21, null, null, 38);
		db.findByCutomerId(21);
		System.out.println("===================");
		db.findAllCustomers();
		
		
		
	}

}
