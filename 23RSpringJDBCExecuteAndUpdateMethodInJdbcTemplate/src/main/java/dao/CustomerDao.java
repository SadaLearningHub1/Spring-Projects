package dao;

import dto.Customer;

public interface CustomerDao {
	
	int insert(Customer c);
	
	void update(Customer c);

}
