package dao;

import model.Customer;

public interface CustomerDAO {
	public void addCustomer(Customer cust);

	public void updateCustomer(int custId);

	public void deleteCustomer(int custid);

	public void searchCustomer(int custId);

}