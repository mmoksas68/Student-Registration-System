package com.group29.srs.mappers;

import com.group29.srs.model.AvailableCourse;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentAvailableCourseMapper implements RowMapper<AvailableCourse> {
    @Override
    public AvailableCourse mapRow(ResultSet resultSet, int index) throws SQLException {
        AvailableCourse ac = new AvailableCourse();
        ac.setFirstname(resultSet.getString("firstname"));
        ac.setLastname(resultSet.getString("lastname"));
        ac.setCourse_code(resultSet.getString("course_code"));
        ac.setCourse_id(resultSet.getLong("course_id"));
        ac.setName(resultSet.getString("name"));
        ac.setAvailable_quota(resultSet.getInt("available_quota"));
        ac.setTotal_quota(resultSet.getInt("total_quota"));
        ac.setSection_id(resultSet.getInt("section_id"));
        return ac;
    }
}