package model;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import dao.TestDao;

public class DemoBean {
	private TestDao testDao;

	
	@Autowired
	@Qualifier("dao")
	public void setTestDao(TestDao testDao) {
		this.testDao = testDao;
	}
	
	public void findBonus() {
		Map map = testDao.callFunction();
		int bonus = (Integer)map.get("b");
		System.out.println("Bonus : "+bonus);
	}

}
