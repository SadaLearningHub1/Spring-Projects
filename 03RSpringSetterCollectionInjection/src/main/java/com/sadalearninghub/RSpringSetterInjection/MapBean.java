package com.sadalearninghub.RSpringSetterInjection;

import java.util.Map;

public class MapBean {
	private Map<String, String> myMap;
	public void setMyMap(Map<String, String> myMap) {
		this.myMap = myMap;
	}
	public void show() {
		System.out.println("MyMap values: "+myMap);
	}

}
