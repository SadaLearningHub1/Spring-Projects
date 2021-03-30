package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applocationContext.xml");
		TestBean testBean = (TestBean)ctx.getBean("tb");
		testBean.businessMethod();

	}

}
