package com.group29.srs.mappers;

import com.group29.srs.model.UnAvailableCourse;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentUnAvailableCourseMapper implements RowMapper<UnAvailableCourse> {
    @Override
    public UnAvailableCourse mapRow(ResultSet resultSet, int index) throws SQLException {
        UnAvailableCourse ac = new UnAvailableCourse();
        ac.setCourse_code(resultSet.getString("course_code"));
        ac.setCourse_type(resultSet.getString("course_type"));
        ac.setCourse_id(resultSet.getLong("course_id"));
        ac.setName(resultSet.getString("name"));
        return ac;
    }
}