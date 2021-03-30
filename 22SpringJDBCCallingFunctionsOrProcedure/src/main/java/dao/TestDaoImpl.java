package dao;

import java.sql.Types;
import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;

public class TestDaoImpl implements TestDao {

	private JdbcTemplate jt;
	@Autowired
	@Qualifier("jt")
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	
	@Override
	public Map callFunction() {
		ArrayList alist = new ArrayList();
		alist.add(new SqlOutParameter("b", Types.INTEGER));
		alist.add(new SqlParameter(Types.INTEGER));
		Map map = jt.call(new MyCallableStatementCreator(), alist);		
		return map;
	}
	

}
