package dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class SelectDaoImpl implements SelectDao{
	
	private NamedParameterJdbcTemplate jt;
	@Autowired
	@Qualifier("jt")
	public void setJt(NamedParameterJdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public Map findById(int custId) {
		Map map1 = new HashMap();
		map1.put("custId", custId);
		Map map = jt.queryForMap("select * from Customer where id=:custId",map1);
		return map;
	}
}
