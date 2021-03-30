package dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;

public class SelectDaoImpl implements SelectDao{
	
	private JdbcTemplate jt;
	@Autowired
	@Qualifier("jt")
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public Map findById(int custId) {
		Map map = jt.queryForMap("select * from Customer where id=?",custId);
		return map;
	}

	@Override
	public List findAll() {
		List list = jt.queryForList("select * from Customer");
		return list;
	}

}
