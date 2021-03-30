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
	public void findAllCustomers() {
		List list = selectDao.findAll();
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Map map = (Map)it.next();
			Set set = map.entrySet();
			Iterator it1 = set.iterator();
			while(it1.hasNext()) {
				Map.Entry me = (Map.Entry)it1.next();
				System.out.println(me.getKey()+ " : "+me.getValue());
			}
			System.out.println("==========================");
		}
	}

}
