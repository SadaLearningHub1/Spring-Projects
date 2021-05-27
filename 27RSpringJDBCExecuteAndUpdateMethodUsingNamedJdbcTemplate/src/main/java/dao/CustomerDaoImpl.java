package dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import dto.Customer;

public class CustomerDaoImpl implements CustomerDao {
	
	private NamedParameterJdbcTemplate jt;
	public void setJt(NamedParameterJdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public int insert(Customer c) {
		Map m = new HashMap();
		m.put("cid", c.getCustomerId());
		m.put("cName", c.getCustomerName());
		m.put("addr", c.getCustomerAddress());
		m.put("age", c.getAge());
		int result = jt.update("insert into Customer values(:cid,:cName,:addr,:age)", m);
		return result;
	}

	@Override
	public <T> void update(Customer c) {
		Map m = new HashMap();
		m.put("age", c.getAge());
		m.put("cid", c.getCustomerId());
		int cid = c.getCustomerId();
		jt.execute("update Customer set age=:age where CID=:cid", m, new MyPreparedStatementCreator<T>());
		
	}
	
	

}
