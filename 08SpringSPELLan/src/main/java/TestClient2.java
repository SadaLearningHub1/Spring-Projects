import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClient2 {
	public static void main(String args[]) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans2.xml");
		Object o=ctx.getBean("a");
		A a = (A)o;
		a.getX();
	}

}
