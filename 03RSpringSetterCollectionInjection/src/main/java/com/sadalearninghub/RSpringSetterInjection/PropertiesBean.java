package com.sadalearninghub.RSpringSetterInjection;

import java.util.Properties;

public class PropertiesBean {
	private Properties myProperties;
	public void setMyProperties(Properties myProperties) {
		this.myProperties = myProperties;
	}
	public void disp() {
		System.out.println("My properties values: "+ myProperties);
	}

}
