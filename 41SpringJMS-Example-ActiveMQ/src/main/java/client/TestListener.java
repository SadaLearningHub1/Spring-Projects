package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;  
public class TestListener {  
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applocationContextJMSReceiver.xml");
		while(true){}  
	}  
}  