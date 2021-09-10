package com.sadalearninghub.SpringBatchExample;

import org.springframework.batch.item.ItemProcessor;

import com.sadalearninghub.SpringBatchExample.model.Report;

public class CustomItemProcessor implements ItemProcessor<Report, Report> {

	@Override
	public Report process(Report item) throws Exception {
		System.out.println("processing Item : "+item);
		return item;
	}

}
