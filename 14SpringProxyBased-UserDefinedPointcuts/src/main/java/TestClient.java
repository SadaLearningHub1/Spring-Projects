import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClient {
	public static void main(String args[]) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Object o=ctx.getBean("pfb");
		Factorial f = (Factorial)o;
		f.findFactorial(0);
		System.out.println("=================");
		f.findFactorial(5);
		System.out.println("=========================");
		f.findFactorial(-1);
	}

}
