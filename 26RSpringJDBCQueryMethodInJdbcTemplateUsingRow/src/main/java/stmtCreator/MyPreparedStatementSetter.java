package stmtCreator;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.PreparedStatementSetter;

public class MyPreparedStatementSetter implements PreparedStatementSetter {

	@Override
	public void setValues(PreparedStatement ps) throws SQLException {
		ps.setInt(0, 3);
		
	}

}
