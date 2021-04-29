import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClient {
	public static void main(String args[]) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Object o=ctx.getBean("pfb");
		Factorial d= (Factorial)o;
		d.findFactorial(10);
		System.out.println("=====================");
		d.hello();
		
	}

}
