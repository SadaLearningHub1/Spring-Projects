package dao;

import java.util.List;
import java.util.Map;
import java.util.Set;

import dto.Customer;

public interface CustomerDao {
	
	int insert(Customer c);
	
	void update(Customer c);
	
	Map findById(int custId);
	
	List findAll();
	
	List selectAllCustomersUsingRowMapper();
	
	Set selectAllCustomersUsingResultSetExtractor();
	
	void egRowCallbackHandler();
	
	List selectAllCustomersUsingRowMapperWithPreparedStatementCreator();

}
