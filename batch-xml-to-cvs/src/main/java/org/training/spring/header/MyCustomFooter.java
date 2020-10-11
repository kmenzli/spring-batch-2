package org.training.spring.header;

import org.springframework.batch.core.StepExecution;
import org.springframework.batch.item.file.FlatFileFooterCallback;

import java.io.IOException;
import java.io.Writer;

public class MyCustomFooter implements FlatFileFooterCallback {
    private StepExecution stepExecution;
    private Integer totalRecords;

    @Override
    public void writeFooter(Writer writer) throws IOException {

        writer.write("Traitement Fini");

    }

    public StepExecution getStepExecution() {
        return stepExecution;
    }

    public void setStepExecution(StepExecution stepExecution) {
        this.stepExecution = stepExecution;
    }

    public Integer getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
    }
}
