package business;

import dao.CustomerDao;
import dto.Customer;

public class DemoBean {
	
	private CustomerDao customerDao;
	
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
	public void insertCustomer(int cid, String cName, String cAddress, int age) {
		Customer c = new Customer();
		c.setCustomerId(cid);
		c.setCustomerName(cName);
		c.setCustomerAddress(cAddress);
		c.setAge(age);
		int result = customerDao.insert(c);
		System.out.println(result+" rows inserted");
	}
	
	public void updateCustomer(int cid, String cName, String cAddress, int age) {
		Customer c = new Customer();
		c.setCustomerId(cid);
		c.setCustomerName(cName);
		c.setCustomerAddress(cAddress);
		c.setAge(age);
		customerDao.update(c);
		System.out.println("customer update successfully");
	} 

}
