package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestDaoImpl implements TestDao {

	private JdbcTemplate jt;
	
	@Autowired
	@Qualifier("jt")
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public void insertBatch() {
		int k[] = jt.batchUpdate("insert into Customer values(?,?,?,?)", new MyBatchPreparedStatementSetter());
		System.out.println("Batch Completed : "+k);
		
	}

	public void mixBatch() {
		String query[] = {"insert into Customer values(26,'jkl','jkl',43)", "delete from Customer where cid=23"};
		int k[] = jt.batchUpdate(query);
		System.out.println("Batch Completed: "+k);
	}
	
	

}
