package client;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClient {
	public static void main(String[] args) throws InterruptedException {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applocationContextQuartz.xml");
	}
}