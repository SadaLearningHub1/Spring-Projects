package dao;

import org.springframework.jdbc.core.JdbcTemplate;

import dto.Customer;

public class CustomerDaoImpl implements CustomerDao {
	
	private JdbcTemplate jt;
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public int insert(Customer c) {
		int cid = c.getCustomerId();
		String cName = c.getCustomerName();
		String aAddr = c.getCustomerAddress();
		int age = c.getAge();
		int result = jt.update("insert into Customer values(?,?,?,?)", cid, cName, aAddr, age);
		return result;
	}

	@Override
	public void update(Customer c) {
		int cid = c.getCustomerId();
		int age = c.getAge();
		jt.execute("update Customer set age="+age+" where CID="+cid);
		
	}
	
	

}
