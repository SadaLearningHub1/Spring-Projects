package dao;

import java.util.List;
import java.util.Map;

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

	@Override
	public Map findById(int custId) {
		// TODO Auto-generated method stub
		Map m = jt.queryForMap("select * from Customer where CID=?", custId);
		return m;
	}

	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		List list = jt.queryForList("select * from Customer");
		return list;
	}
	
	

}
