import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClient {
	public static void main(String args[]) throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Object o=ctx.getBean("jt");
		if(o != null) {
			System.out.println("JdbcTemplate Object created successfully");
		}else {
			System.out.println("Something is wrong");
		}
		
	}

}
