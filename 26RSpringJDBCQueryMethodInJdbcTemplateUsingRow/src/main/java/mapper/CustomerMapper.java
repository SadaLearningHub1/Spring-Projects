package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import dto.Customer;

public class CustomerMapper implements RowMapper {

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		Customer c = new Customer();
		c.setCustomerId(rs.getInt(1));
		c.setCustomerName(rs.getString(2));
		c.setCustomerAddress(rs.getString(3));
		c.setAge(rs.getInt(4));
		return c;
	}

}
