package client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import business.DemoBean;



public class TestClient {
	public static void main(String args[]) throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Object o=ctx.getBean("db");
		DemoBean d = (DemoBean)o;
		//d.bm();
		d.bm1();
	}

}
