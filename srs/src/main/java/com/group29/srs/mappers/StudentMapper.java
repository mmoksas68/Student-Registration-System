package com.group29.srs.mappers;

import com.group29.srs.model.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentMapper implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet resultSet, int index) throws SQLException {
        Student student = new Student();
        student.setPersonID(resultSet.getInt("PersonID"));
        student.setFirstName(resultSet.getString("FirstName"));
        student.setFirstName(resultSet.getString("LastName"));
        return student;
    }
}
