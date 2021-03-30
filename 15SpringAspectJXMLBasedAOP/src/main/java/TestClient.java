import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClient {
	public static void main(String args[]) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Object o=ctx.getBean("impl");
		Product p = (Product)o;
		p.add(1, 2);
		System.out.println("=======================");
		p.multiply(2, 3);
	}

}
