import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClient {
	public static void main(String args[]) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Object o=ctx.getBean("pfb2");
		Demo demo = (Demo)o;
		demo.sayHello();
		System.out.println("===================");
		demo.sayBye();
		System.out.println("====================");
		String str = demo.getMesssage();
		System.out.println(str);
		System.out.println("===========================");
		demo.welcome();
	}

}
