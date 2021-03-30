package client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Customer;
import services.CustomerService;

public class TestClient {
	public static void main(String args[]) throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applocationContext.xml");
		Object o=ctx.getBean("cs");
		CustomerService   cs = (CustomerService)o;
		
		System.out.println("addCustomer called");
		Customer cust = new Customer("Manish", "Srivastava", 28);
		cs.addCustomer(cust);
		
		System.out.println("addCustomer called");
		cs.updateCustomer(1);
		
		System.out.println("deleteCustomer called");
		cs.deleteCustomer(1);
		
		System.out.println("searchCustomer called");
		cs.searchCustomer(3);

	}

}
