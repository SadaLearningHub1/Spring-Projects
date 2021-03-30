package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mail.SendMailBean;

public class TestClient {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applocationContext.xml");
		Object o = ctx.getBean("id2");
		SendMailBean smb = (SendMailBean)o;
		smb.sendEmail();

	}

}
