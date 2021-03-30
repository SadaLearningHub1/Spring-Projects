package services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import dao.CustomerDAO;
import model.Customer;
import services.CustomerService;

public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerDAO cdao;
	public void addCustomer(Customer cust) {
		cdao.addCustomer(cust);
	}
	public void updateCustomer(int custId) {
		cdao.updateCustomer(custId);
	}
	public void deleteCustomer(int custId) {
		cdao.deleteCustomer(custId);
	}
	public void searchCustomer(int custId) {
		cdao.searchCustomer(custId);
	}
}