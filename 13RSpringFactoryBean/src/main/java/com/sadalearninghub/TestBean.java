package com.sadalearninghub;

import org.springframework.beans.factory.FactoryBean;

public class TestBean implements FactoryBean<Object> {

	public Object getObject() throws Exception {
		B b = new B();
		return b;
	}

	public Class<?> getObjectType() {
		Class bClassObj = B.class;
		return bClassObj;
	}

	public boolean isSingleton() {
		return true;
	}

}
