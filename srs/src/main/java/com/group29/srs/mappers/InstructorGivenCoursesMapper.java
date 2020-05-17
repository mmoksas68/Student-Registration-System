package com.group29.srs.mappers;

import com.group29.srs.model.InstructorGivenCourses;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class InstructorGivenCoursesMapper implements RowMapper<InstructorGivenCourses> {
    @Override
    public InstructorGivenCourses mapRow(ResultSet resultSet, int index) throws SQLException {
        InstructorGivenCourses igc = new InstructorGivenCourses();
        igc.setCourse_code(resultSet.getString("course_code"));
        igc.setName(resultSet.getString("name"));
        igc.setClassroom(resultSet.getString("classroom"));
        igc.setSection_number(resultSet.getInt("section_number"));
        return igc;
    }
}