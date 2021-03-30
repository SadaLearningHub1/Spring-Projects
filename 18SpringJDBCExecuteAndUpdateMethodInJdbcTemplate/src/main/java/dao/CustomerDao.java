package dao;

import dto.Customer;

public interface CustomerDao {
	void createTable(String str);
	int insert(Customer c);
	void dropTable(String str);

}
