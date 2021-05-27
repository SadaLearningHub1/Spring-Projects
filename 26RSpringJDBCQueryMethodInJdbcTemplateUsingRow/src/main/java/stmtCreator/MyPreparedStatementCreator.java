package stmtCreator;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.PreparedStatementCreator;

public class MyPreparedStatementCreator implements PreparedStatementCreator{

	@Override
	public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
		PreparedStatement pstmt = con.prepareStatement("select * from Customer where CID=?");
		return pstmt;
	}

}
