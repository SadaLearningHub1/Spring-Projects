package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applocationContext.xml");
		TestBean testBean = (TestBean) applicationContext.getBean("tb");
		testBean.bm();
	}

}
