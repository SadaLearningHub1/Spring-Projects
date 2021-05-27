package dao;

import java.util.List;
import java.util.Map;

import dto.Customer;

public interface CustomerDao {
	
	int insert(Customer c);
	
	void update(Customer c);
	
	Map findById(int custId);
	
	List findAll();

}
