package com.sadalearninghub;

public class OnlyOne {
	
	private static OnlyOne onlyOne;
	
	private OnlyOne() {	
	}
	
	public static OnlyOne getInstance() {
		if(onlyOne == null) {
			System.out.println("OnlyOne object is created");
			onlyOne = new OnlyOne();	
		}
		return onlyOne;
	}
	

}
