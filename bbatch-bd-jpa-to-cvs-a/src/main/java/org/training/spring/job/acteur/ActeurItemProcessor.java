package org.training.spring.job.acteur;

import org.springframework.batch.item.ItemProcessor;
import org.training.spring.dto.ActeurDto;
import org.training.spring.dto.StructureDto;

public class ActeurItemProcessor implements ItemProcessor<ActeurDto, ActeurDto> {

    @Override
    public ActeurDto process(ActeurDto item) throws Exception {
        System.out.println("Processing result :"+item);

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
