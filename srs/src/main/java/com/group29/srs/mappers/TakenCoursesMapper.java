package com.group29.srs.mappers;

import com.group29.srs.model.TakenCourses;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TakenCoursesMapper implements RowMapper<TakenCourses> {
    @Override
    public TakenCourses mapRow(ResultSet resultSet, int index) throws SQLException {
        TakenCourses tc = new TakenCourses();
        tc.setCourse_id(resultSet.getLong("course_id"));
        tc.setFirstname(resultSet.getString("firstname"));
        tc.setLastname(resultSet.getString("lastname"));
        tc.setCourse_code(resultSet.getString("course_code"));
        tc.setName(resultSet.getString("name"));
        tc.setSection_number(resultSet.getInt("section_number"));
        tc.setCredits(resultSet.getInt("credits"));
        return tc;
    }
}