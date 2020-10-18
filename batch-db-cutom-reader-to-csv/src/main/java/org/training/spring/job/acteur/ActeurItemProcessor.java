package org.training.spring.job.acteur;

import org.springframework.batch.item.ItemProcessor;
import org.training.spring.dto.ActeurDto;

import java.util.List;

public class ActeurItemProcessor implements ItemProcessor<List<ActeurDto>, List<ActeurDto>> {

    @Override
    public List<ActeurDto> process(List<ActeurDto> item) throws Exception {
        System.out.println("Processing result :"+item);

        /*
         * Only return results which are equal or more than 80%
         *
         */

        return item;
    }
}
