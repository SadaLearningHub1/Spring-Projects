import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClient3 {
	public static void main(String args[]) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans3.xml");
		Object o=ctx.getBean("id1");
		NumberGuss n = (NumberGuss)o;
		n.showRandomNumber();
	}

}
