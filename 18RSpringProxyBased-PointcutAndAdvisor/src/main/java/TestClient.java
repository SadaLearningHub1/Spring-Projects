import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClient {
	public static void main(String args[]) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Object o=ctx.getBean("pfb1");
		Demo d= (Demo)o;
		d.sayHello();
		System.out.println("=====================");
		d.sayBye();
		System.out.println("=====================");
		
		Object o1=ctx.getBean("pfb2");
		Demo d1 = (Demo)o1;
		String str = d1.getMessage();
		System.out.println(str);
		System.out.println("=====================");
		d1.welcoe();
	}

}
