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
	
	public void selectAllCust() {
		System.out.println("data extracted through ResultSetMapper");
		List<Customer> customerList = customerDao.selectAllCustomersUsingRowMapper();
		for(Customer c: customerList) {
			System.out.println("Customer Id: "+c.getCustomerId());
			System.out.println("Customer First Name : "+c.getCustomerName());
			System.out.println("Customer Last Name: "+c.getCustomerAddress());
			System.out.println("Customet Age : "+c.getAge());
			System.out.println("================");
		}
		
		System.out.println("data extracted through ResultSetExtractor");
		Set customerList1 = customerDao.selectAllCustomersUsingResultSetExtractor();
		for(Object o: customerList1) {
			Customer c = (Customer)o;
			System.out.println("Customer Id: "+c.getCustomerId());
			System.out.println("Customer First Name : "+c.getCustomerName());
			System.out.println("Customer Last Name: "+c.getCustomerAddress());
			System.out.println("Customet Age : "+c.getAge());
			System.out.println("================");
		}
		
		System.out.println("RowCallbackHandler Example");
		customerDao.egRowCallbackHandler();
		
		System.out.println("Prepared Statement creator Exaple");
		List<Customer> customerList2 = customerDao.selectAllCustomersUsingRowMapperWithPreparedStatementCreator();
		for(Customer c: customerList2) {
			System.out.println("Customer Id: "+c.getCustomerId());
			System.out.println("Customer First Name : "+c.getCustomerName());
			System.out.println("Customer Last Name: "+c.getCustomerAddress());
			System.out.println("Customet Age : "+c.getAge());
			System.out.println("================");
		}
	}

}
