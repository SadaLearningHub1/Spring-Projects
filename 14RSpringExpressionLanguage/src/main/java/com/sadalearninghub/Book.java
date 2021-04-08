package com.sadalearninghub;

public class Book {
	
	private String authorName;
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	public void show() {
		System.out.println("Author Name: "+ authorName);
	}

}
