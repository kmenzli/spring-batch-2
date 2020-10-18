package org.training.spring.commons;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.training.spring.dto.ActeurDto;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class ActeurRowMapper implements RowMapper<ActeurDto> {

    @Override
    public ActeurDto mapRow(ResultSet rs, int i) throws SQLException {
        ActeurDto customer = new ActeurDto();
        customer.setId(rs.getLong("ID"));
        customer.setNom(rs.getString("NOM"));
        customer.setPrenom(rs.getString("PRENOM"));
        //customer.setCreatedDate(rs.getTimestamp("created_date").toLocalDateTime());

        return customer;
    }
}
