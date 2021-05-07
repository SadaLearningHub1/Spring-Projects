import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClient {
	public static void main(String args[]) throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Object o=ctx.getBean("id1");
		Demo d = (Demo)o;
		d.businessMethod1(1000);
		System.out.println("=============================");
		d.businessMethod2();
	}

}
