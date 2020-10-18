package org.training.spring.commons.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.training.spring.commons.ActeurRowMapper;
import org.training.spring.commons.service.UserService;
import org.training.spring.dto.ActeurDto;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;



    /**
    public ActeurDto findByActeurId(Long id) {

        String sql = "SELECT * FROM ACTEUR";

        return (ActeurDto) jdbcTemplate.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper(ActeurDto.class));

    }
*/



    @Override
    public List<ActeurDto> findAllV2() {

        String sql = "SELECT * FROM ACTEUR";

        List<ActeurDto> customers = jdbcTemplate.query(
                sql,
                new ActeurRowMapper());

        return customers;
    }


    public List<ActeurDto> findAllV1() {

        String sql = "SELECT * FROM CUSTOMER";

        List<ActeurDto> customers = jdbcTemplate.query(
                sql,
                new BeanPropertyRowMapper(ActeurDto.class));

        return customers;
    }
}
