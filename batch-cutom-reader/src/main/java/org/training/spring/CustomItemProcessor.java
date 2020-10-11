package org.training.spring;

import org.springframework.batch.item.ItemProcessor;
import org.training.spring.model.StudentDTO;

public class CustomItemProcessor implements ItemProcessor<StudentDTO, StudentDTO> {

    @Override
    public StudentDTO process(StudentDTO item) throws Exception {

        item.setEmailAddress(item.getEmailAddress()+"Modified");
        return item;
    }
}
