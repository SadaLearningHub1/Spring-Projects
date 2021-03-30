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
		Thread.sleep(2000);
		System.out.println("=============================");
		d.afterReturning();
		System.out.println("===============================");
		d.before();
		System.out.println("====================================");
		d.businessMethod1(-100);
	}

}
