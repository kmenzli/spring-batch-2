package org.training.spring.job.structure;

import org.springframework.batch.item.ItemProcessor;
import org.training.spring.dto.ActeurDto;

public class StructureItemProcessor implements ItemProcessor<ActeurDto, ActeurDto> {

    @Override
    public ActeurDto process(ActeurDto item) throws Exception {
        System.out.println("Processing Structure :"+item);

        /*
         * Only return results which are equal or more than 80%
         *
         */
        if(item.getNombreAchat()> 80){
            return null;
        }
        return item;
    }
}
