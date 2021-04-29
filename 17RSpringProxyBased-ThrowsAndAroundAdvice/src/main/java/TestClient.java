import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClient {
	public static void main(String args[]) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Object o=ctx.getBean("pfb");
		Arthematic b= (Arthematic)o;
		try {
			b.dividion(10, 0);
		}catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("=====================================");
		b.multiply(10, 20);
		System.out.println("=====================================");
		b.dividion(10, 2);
		
	}

}
