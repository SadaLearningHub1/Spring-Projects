package client;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClient {
	public static void main(String[] args) throws InterruptedException {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applocationContextJdk.xml");
		
		Thread.sleep(30000);
		context.close();
	}




}
//create table Person(id number(5), name varchar2(10), country varchar2(10), primary key(id));