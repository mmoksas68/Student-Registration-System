package com.group29.srs.mappers;

import com.group29.srs.model.AssignmentGrades;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TeachingAssistantGradeMapper implements RowMapper<AssignmentGrades> {
    @Override
    public AssignmentGrades mapRow(ResultSet resultSet, int index) throws SQLException {
        AssignmentGrades ag = new AssignmentGrades();
        ag.setFirstname(resultSet.getString("firstname"));
        ag.setLastname(resultSet.getString("lastname"));
        ag.setUser_id(resultSet.getLong("user_id"));
        ag.setCourse_code(resultSet.getString("course_code"));
        ag.setSection_number(resultSet.getInt("section_number"));
        return ag;
    }
}