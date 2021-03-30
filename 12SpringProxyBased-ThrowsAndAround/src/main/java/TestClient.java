import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClient {
	public static void main(String args[]) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Object o=ctx.getBean("pfb");
		Arthematic a= (Arthematic)o;
		try {
			a.division(10, 0);
		}catch (Exception e) {
		}
		System.out.println("===================");
		int x=a.multiply(10, 2);
		System.out.println("Multiple ="+x);
		
	}

}
