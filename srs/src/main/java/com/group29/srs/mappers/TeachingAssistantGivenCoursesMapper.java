package com.group29.srs.mappers;

import com.group29.srs.model.TeachingAssistantGivenCourses;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TeachingAssistantGivenCoursesMapper implements RowMapper<TeachingAssistantGivenCourses> {
    @Override
    public TeachingAssistantGivenCourses mapRow(ResultSet resultSet, int index) throws SQLException {
        TeachingAssistantGivenCourses tagc = new TeachingAssistantGivenCourses();
        tagc.setCourse_code(resultSet.getString("course_code"));
        tagc.setName(resultSet.getString("name"));
        return tagc;
    }
}