package dao;

import dto.Customer;

public interface CustomerDao {
	
	int insert(Customer c);
	
	<T> void update(Customer c);

}
