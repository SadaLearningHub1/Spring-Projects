package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import JMS.MyMessageSender;  
public class TestJmsSender {  
	public static void main(String[] args) {  
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applocationContextJMSSender.xml");
		MyMessageSender sender=ctx.getBean("messageSender",MyMessageSender.class);  
		sender.sendMessage("hello JMS");  

	}  
}  