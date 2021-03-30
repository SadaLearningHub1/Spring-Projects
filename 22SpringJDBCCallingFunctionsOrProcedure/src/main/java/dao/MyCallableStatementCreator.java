package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import org.springframework.jdbc.core.CallableStatementCreator;

public class MyCallableStatementCreator implements CallableStatementCreator{

	@Override
	public CallableStatement createCallableStatement(Connection con) throws SQLException {
		CallableStatement cstmt = con.prepareCall("{?=call fun10(?)}");
		cstmt.setInt(2, 1);
		cstmt.registerOutParameter(1, Types.INTEGER);
		return cstmt;
	}

}
