package com.group29.srs.repository;

import com.group29.srs.mappers.ExchangeSchoolMapper;
import com.group29.srs.model.Exchange_School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ExchangeRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Exchange_School> getExchangeInfoById(Long id) {
        return jdbcTemplate.query("SELECT es.school_name,es.school_country,es.department, es.available_semester, s.erasmus_application_point " +
                "FROM Student s,ExchangeSchool es " +
                "WHERE s.student_id = ?;", new Object[]{id}, new ExchangeSchoolMapper());
    }
}

