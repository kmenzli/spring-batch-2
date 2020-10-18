package org.training.spring.mapping;

import org.springframework.jdbc.core.RowMapper;
import org.training.spring.dto.ActeurDto;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ActeurResultMapper implements RowMapper<ActeurDto> {
    @Override
    public ActeurDto mapRow(ResultSet rs, int i) throws SQLException {
        ActeurDto  acteurDto = new ActeurDto();
        acteurDto.setNom(rs.getString(2));
        acteurDto.setPrenom(rs.getString(3));
        acteurDto.setEmail(rs.getString(4));
        acteurDto.setDateNaissance(rs.getDate(5));
        acteurDto.setPays(rs.getString(6));
        acteurDto.setVille(rs.getString(7));
        acteurDto.setCodePostae(rs.getString(8));
        acteurDto.setNombreAchat(rs.getInt(9));
        return acteurDto;
    }
}
