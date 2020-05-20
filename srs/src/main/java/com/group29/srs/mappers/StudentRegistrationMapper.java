package com.group29.srs.mappers;

import com.group29.srs.model.StudentRegistration;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRegistrationMapper implements RowMapper<StudentRegistration> {
    @Override
    public StudentRegistration mapRow(ResultSet resultSet, int index) throws SQLException {
        StudentRegistration sr = new StudentRegistration();
        sr.setCourse_code(resultSet.getString("course_code"));
        sr.setCourse_type(resultSet.getString("course_type"));
        sr.setCourse_id(resultSet.getLong("course_id"));
        sr.setName(resultSet.getString("name"));
        return sr;
    }
}