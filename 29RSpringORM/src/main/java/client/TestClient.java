package client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.DemoBean;

public class TestClient {
	public static void main(String args[]) throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applocationContext.xml");
		Object o=ctx.getBean("cs");
		DemoBean demoBean= (DemoBean)o;
//		demoBean.addStudent(1, "Rajesh", 100);
//		demoBean.addStudent(2, "sada", 50);
//		System.out.println("======================");
//		demoBean.selectStudents();
		System.out.println("======================");
		demoBean.saveOrUpdateStudent(3, "Rao", 20);
		System.out.println("======================");
		demoBean.selectStudents();

	}

}
