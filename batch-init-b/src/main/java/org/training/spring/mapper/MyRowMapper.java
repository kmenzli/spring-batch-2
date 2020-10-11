package org.training.spring.mapper;

import org.springframework.jdbc.core.RowMapper;
import org.training.spring.model.Personne;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MyRowMapper implements RowMapper<Personne> {
    public Personne mapRow(ResultSet rs, int nb) throws SQLException {
        Personne client=new Personne();
        client.setId(rs.getInt("id"));
        client.setNom(rs.getString("nom"));
        client.setPrenom(rs.getString("prenom"));
        client.setAdresse(rs.getString("adresse"));
        return client;
    }
}
