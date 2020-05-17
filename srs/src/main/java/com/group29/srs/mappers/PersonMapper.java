package com.group29.srs.mappers;

import com.group29.srs.model.Person;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonMapper implements RowMapper<Person> {
    @Override
    public Person mapRow(ResultSet resultSet, int index) throws SQLException {
        Person person = new Person();
        person.setPersonId(resultSet.getLong("PersonID"));
        person.setFirstName(resultSet.getString("FirstName"));
        person.setFirstName(resultSet.getString("LastName"));
        return person;
    }
}
