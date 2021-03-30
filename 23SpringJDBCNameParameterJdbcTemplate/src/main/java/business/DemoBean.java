package business;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import dao.SelectDao;

public class DemoBean {
	private SelectDao selectDao;

	@Autowired
	@Qualifier("dao")
	public void setSelectDao(SelectDao selectDao) {
		this.selectDao = selectDao;
	}
	
	public void findByCustomerId(int customerId) {
		Map map = selectDao.findById(customerId);
		Set set = map.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Map.Entry me = (Map.Entry)it.next();
			System.out.println(me.getKey()+ " : "+me.getValue());
		}
	}
}
