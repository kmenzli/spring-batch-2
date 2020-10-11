package org.training.spring;

import org.springframework.batch.item.ItemWriter;
import org.training.spring.model.StudentDTO;

import java.util.List;

public class CustomWriter implements ItemWriter<StudentDTO> {

    @Override
    public void write(List<? extends StudentDTO> items) throws Exception {

        for (StudentDTO studentDTO : items) {
            System.out.println(studentDTO.toString());
        }

    }
}
