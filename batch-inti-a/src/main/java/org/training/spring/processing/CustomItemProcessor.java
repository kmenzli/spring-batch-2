package org.training.spring.processing;

import org.springframework.batch.item.ItemProcessor;
import org.training.spring.model.Output;
import org.training.spring.model.Report;

public class CustomItemProcessor implements ItemProcessor<Report, Report> {

    @Override
    public Report process(Report output) throws Exception {

        System.out.println("Processing..." + output);
        return new Report();
    }
}
