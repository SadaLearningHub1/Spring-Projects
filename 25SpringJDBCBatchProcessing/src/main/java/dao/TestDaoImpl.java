package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestDaoImpl implements TestDao{
	
	private JdbcTemplate jt;
	
	@Autowired
	@Qualifier("jt")
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public void insertBatch() {
		int k[] = jt.batchUpdate("insert into test values(?,?)",new MyBatchPreparedStatementSetter());
		System.out.println("Batch Executed");
		
	}
	

}
