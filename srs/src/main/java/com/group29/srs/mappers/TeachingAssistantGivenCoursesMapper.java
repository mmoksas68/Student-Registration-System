package com.group29.srs.mappers;

import com.group29.srs.model.TeachingAssistantGivenCourses;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TeachingAssistantGivenCoursesMapper implements RowMapper<TeachingAssistantGivenCourses> {
    @Override
    public TeachingAssistantGivenCourses mapRow(ResultSet resultSet, int index) throws SQLException {
        TeachingAssistantGivenCourses tagc = new TeachingAssistantGivenCourses();
        tagc.setFirstname(resultSet.getString("firstname"));
        tagc.setLastname(resultSet.getString("lastname"));
        tagc.setCourse_code(resultSet.getString("course_code"));
        tagc.setName(resultSet.getString("name"));
        tagc.setClassroom(resultSet.getString("classroom"));
        return tagc;
    }
}