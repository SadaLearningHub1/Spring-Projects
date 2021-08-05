package client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import transaction.Account;

public class TestClient {
	public static void main(String args[]) throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applocationContext.xml");
		Object o=ctx.getBean("accimpl");
		Account   ac = (Account)o;
		ac.transferMoney(1, 2, 1350);

	}

}
