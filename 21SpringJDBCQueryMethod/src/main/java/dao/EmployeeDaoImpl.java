package dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDaoImpl implements EmployeeDao{
	
	private JdbcTemplate jt;
	
	
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}


	@Override
	public List selectAllEmployees() {
		List list = jt.query("select * from emp",  new EmployeeMapper());
		return list;
	}

}
