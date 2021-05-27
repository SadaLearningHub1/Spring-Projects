package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;



public class MyBatchPreparedStatementSetter implements BatchPreparedStatementSetter {
	
	List l1 = new ArrayList();
	List l2 = new ArrayList();
	List l3 = new ArrayList();
	List l4 = new ArrayList();
	
	public MyBatchPreparedStatementSetter() {
		l1.add(23);
		l1.add(24);
		l1.add(25);
		l2.add("abc");
		l2.add("def");
		l2.add("ghi");
		l3.add("abc");
		l3.add("def");
		l3.add("ghi");
		l4.add(40);
		l4.add(41);
		l4.add(42);
	}

	public void setValues(PreparedStatement ps, int i) throws SQLException {
		ps.setInt(1, (Integer) l1.get(i));
		ps.setString(2, (String) l2.get(i));
		ps.setString(3, (String) l3.get(i));
		ps.setInt(4,  (Integer) l4.get(i));

	}

	public int getBatchSize() {
		return 3;
	}

}
