package client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import transaction.Demo;

public class TestClient {
	public static void main(String args[]) throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applocationContext.xml");
		Object o=ctx.getBean("db");
		Demo   db = (Demo)o;
		db.transMethod1();

	}

}
