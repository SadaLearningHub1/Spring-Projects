package model;

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
	
	public void executeBatch() {
		testDao.insertBatch();
	}

}
