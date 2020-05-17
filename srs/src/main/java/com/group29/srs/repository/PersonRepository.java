package com.group29.srs.repository;

import com.group29.srs.mappers.PersonMapper;
import com.group29.srs.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Person> getPersons(){
        return  jdbcTemplate.query("SELECT * FROM Persons;", new PersonMapper());
    }
}
