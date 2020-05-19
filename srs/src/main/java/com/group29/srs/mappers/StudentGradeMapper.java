package com.group29.srs.mappers;

import com.group29.srs.model.Grades;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentGradeMapper implements RowMapper<Grades> {
    @Override
    public Grades mapRow(ResultSet resultSet, int index) throws SQLException {
        Grades g = new Grades();
        g.setTitle(resultSet.getString("title"));
        g.setDate(resultSet.getString("date"));
        g.setType(resultSet.getString("type"));
        g.setGrade(resultSet.getInt("grade"));
        return g;
    }
}