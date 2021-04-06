package com.sadalearninghub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class InstrumentList {
	
	/*@Autowired
	@Qualifier("g")
	private Guitar guitar;
	
	@Autowired
	private SongSelector songSelector;*/
	
	private final Guitar guitar;
	private final SongSelector songSelector;
	
	@Autowired
	public InstrumentList(Guitar guitar, SongSelector songSelector) {
		this.guitar = guitar;
		this.songSelector = songSelector;
	}
	
	/*@Autowired
	@Qualifier("g")
	public void SetGuitar(Guitar guitar) {
		this.guitar = guitar;
	}*/
	
	/*@Autowired
	public void setSongSelector(SongSelector songSelector) {
		this.songSelector = songSelector;
	}*/
	
	public void show() {
		guitar.playGuitar();
		songSelector.playSong();
	}

}
