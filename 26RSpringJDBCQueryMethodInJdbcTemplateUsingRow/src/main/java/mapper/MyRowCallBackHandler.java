package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;

public class MyRowCallBackHandler implements RowCallbackHandler {

	@Override
	public void processRow(ResultSet rs) throws SQLException {
		System.out.println("CustomertName: "+rs.getInt(1)+ " Customer Fname : "+rs.getString(2)+" CustomerLName: "+rs.getString(3)+" Customer Age: "+rs.getInt(4));
		System.out.println("Processing logic in RowCallbackHandler");
	}

}
