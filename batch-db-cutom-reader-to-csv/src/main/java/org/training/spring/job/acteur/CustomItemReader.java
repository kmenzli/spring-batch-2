package org.training.spring.job.acteur;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.training.spring.commons.service.UserService;
import org.training.spring.dto.ActeurDto;

import java.util.List;

public class CustomItemReader implements ItemReader<List<ActeurDto>> {

    private int nextIndex;
    private int  size;
    private int  offset;

    public CustomItemReader() {

        this.nextIndex = 0;
        this.size=30;
        this.offset=10;

        // récupérer la size des elets
    }

    @Autowired
    UserService userService;

    @Override
    public List<ActeurDto> read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        ActeurDto acteurDto = null;


        if (this.nextIndex < this.size) {

            this.nextIndex+=this.offset;
            List<ActeurDto> ac = userService.findActeur();
            return ac;

        }

        return userService.findActeur();



    }


}
