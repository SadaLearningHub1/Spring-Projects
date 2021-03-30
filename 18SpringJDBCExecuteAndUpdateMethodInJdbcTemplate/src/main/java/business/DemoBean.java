package business;

import dao.CustomerDao;
import dto.Customer;

public class DemoBean {
	private CustomerDao customerDao;

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
	public void insertCustomer(int cid, String cname, String caddr) {
		Customer c = new Customer();
		c.setCustomerId(cid);
		c.setCustomerName(cname);
		c.setCustomerAddress(caddr);
		int k = customerDao.insert(c);
		System.out.println(k +" Records are inserted successfully");
	}
	public void createCustomerTable(String str) {
		customerDao.createTable(str);
	}
	public void dropTable(String str) {
		customerDao.dropTable(str);
	}

}
