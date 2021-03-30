package services;

import model.Customer;

public interface CustomerService {
	public void addCustomer(Customer cust);

	public void updateCustomer(int custId);

	public void deleteCustomer(int custId);

	public void searchCustomer(int custId);

}