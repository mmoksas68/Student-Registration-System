package com.group29.srs.repository;

import com.group29.srs.mappers.StudentMapper;
import com.group29.srs.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Student> getStudents(){
        return  jdbcTemplate.query("SELECT * FROM Persons;", new StudentMapper());
    }
}
