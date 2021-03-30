package dao;

import org.springframework.jdbc.core.JdbcTemplate;

import dto.Customer;

public class CustomerDaoImpl implements CustomerDao {
	
	private JdbcTemplate jt;
	
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public void createTable(String str) {
		//create table Customer(id number(5) primary key, cname varchar2(10), caddr varchar2(10))
		jt.execute(str);
		
	}

	@Override
	public int insert(Customer c) {
		int cid = c.getCustomerId();
		String cname = c.getCustomerName();
		String caddr = c.getCustomerAddress();
		int i = jt.update("insert into Customer values(?,?,?)",cid, cname, caddr);
		return i;
	}

	@Override
	public void dropTable(String str) {
		//drop table Customer
		jt.execute(str);
	}

}
