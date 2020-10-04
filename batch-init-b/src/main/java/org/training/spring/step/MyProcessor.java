package org.training.spring.step;

import org.springframework.batch.item.ItemProcessor;
import org.training.spring.model.Personne;

public class MyProcessor implements ItemProcessor<Personne, String> {
    public String process(Personne pers) throws Exception {
        return pers.getId()+","+pers.getPrenom()+","+pers.getNom();
    }
}