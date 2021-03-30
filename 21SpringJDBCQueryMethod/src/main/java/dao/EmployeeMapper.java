package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import model.Employee;

public class EmployeeMapper implements RowMapper{

	@Override
	public Object mapRow(ResultSet rs, int arg1) throws SQLException {
		Employee e = new Employee();
		e.setEmpno(rs.getInt(1));
		e.setEname(rs.getString(2));
		e.setSal(rs.getInt(3));
		e.setDeptno(rs.getInt(4));
		return e;
	}

}
