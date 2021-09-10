package com.sadalearninghub.SpringBatch_Run_Example;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

public class CustomWriter<T> implements ItemWriter<T> {

	public void write(List<? extends T> items) throws Exception {

		for (int i = 0; items.size() > i; i++) {
			Domain obj = (Domain) items.get(i);
			System.out.println(obj.getId() + ":" + obj.getDomain());
		}
		
	}
}