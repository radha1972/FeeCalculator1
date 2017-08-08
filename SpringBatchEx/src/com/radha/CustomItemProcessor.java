package com.radha;

import org.springframework.batch.item.ItemProcessor;
import com.radha.model.Report;

public class CustomItemProcessor implements ItemProcessor<Report, Report> {

	@Override
	public Report process(Report item) throws Exception {

		System.out.println("Processing..." + item);
		return item;
	}

}