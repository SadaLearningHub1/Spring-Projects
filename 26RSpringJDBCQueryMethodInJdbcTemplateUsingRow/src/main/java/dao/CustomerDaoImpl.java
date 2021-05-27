package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;

import dto.Customer;
import mapper.CustomerMapper;
import mapper.CustomerResultSetExtractor;
import mapper.MyRowCallBackHandler;
import stmtCreator.MyPreparedStatementCreator;
import stmtCreator.MyPreparedStatementSetter;

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

	@Override
	public List selectAllCustomersUsingRowMapper() {
		List customerList = jt.query("select * from Customer", new CustomerMapper());
		return customerList;
	}

	@Override
	public Set selectAllCustomersUsingResultSetExtractor() {
		Set s = jt.query("select * from Customer", new CustomerResultSetExtractor());
		return s;
	}

	@Override
	public void egRowCallbackHandler() {
		jt.query("select * from Customer", new MyRowCallBackHandler());
		
	}

	@Override
	public List selectAllCustomersUsingRowMapperWithPreparedStatementCreator() {
		List customerList = jt.query(new MyPreparedStatementCreator(), new MyPreparedStatementSetter(), new CustomerResultSetExtractor());
		
		//List customerList1 = jt.query("select * from Customer where CID=?", new MyPreparedStatementSetter(), new CustomerResultSetExtractor());
		return customerList;
	}
	
	

}
