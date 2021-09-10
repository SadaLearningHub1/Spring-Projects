package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applocationContext.xml");
		TestBean bean = (TestBean) applicationContext.getBean("tb");
		bean.bm();
	}

}
