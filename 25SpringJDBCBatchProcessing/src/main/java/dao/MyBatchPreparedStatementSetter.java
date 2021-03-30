package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;

public class MyBatchPreparedStatementSetter implements BatchPreparedStatementSetter {
	
	List list1 = new ArrayList();
	List list2 = new ArrayList();
	
	public MyBatchPreparedStatementSetter() {
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list2.add("a");
		list2.add("b");
		list2.add("c");
	}

	@Override
	public int getBatchSize() {
		return 3;
	}

	@Override
	public void setValues(PreparedStatement pstmt, int i) throws SQLException {
		pstmt.setInt(1, Integer.parseInt(list1.get(i).toString()));
		pstmt.setString(2, list2.get(i).toString());
		
	}

}
