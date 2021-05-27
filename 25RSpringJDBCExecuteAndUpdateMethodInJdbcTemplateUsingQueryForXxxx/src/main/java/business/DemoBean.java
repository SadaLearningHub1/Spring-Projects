package business;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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
	
	public void findByCutomerId(int customerId) {
		Map map = customerDao.findById(customerId);
		Set s = map.entrySet();
		Iterator it = s.iterator();
		while(it.hasNext()) {
			Map.Entry me = (Entry) it.next();
			System.out.println(me.getKey());
			System.err.println(me.getValue());
		}
	}
	
	public void findAllCustomers() {
		List l = customerDao.findAll();
		Iterator it1 = l.iterator();
		while(it1.hasNext()) {
			Map map = (Map)it1.next();
			Set s = map.entrySet();
			Iterator it = s.iterator();
			while(it.hasNext()) {
				Map.Entry me = (Entry) it.next();
				System.out.println(me.getKey());
				System.err.println(me.getValue());
			}
			System.out.println("===================");
		}
	}

}
