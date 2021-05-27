package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import dto.Customer;

public class CustomerResultSetExtractor implements ResultSetExtractor{

	@Override
	public Object extractData(ResultSet rs) throws SQLException, DataAccessException {
		//List l = new ArrayList();//
		Set s = new HashSet();
		while(rs.next()) {//
			Customer c = new Customer();
			c.setCustomerId(rs.getInt(1));
			c.setCustomerName(rs.getString(2));
			c.setCustomerAddress(rs.getString(3));
			c.setAge(rs.getInt(4));
			//l.add(c);//
			s.add(c);
		}
		return s;
	}

}
