package com.sadalearninghub;

public class InstrumentList {
	
	private String song;
	
	public void setSong(String song) {
		this.song = song;
	}
	
	public void showSong() {
		System.out.println("Selected Song is: "+ song);
	}

}
