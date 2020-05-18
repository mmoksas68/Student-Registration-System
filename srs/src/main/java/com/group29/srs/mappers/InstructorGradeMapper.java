package com.group29.srs.mappers;

import com.group29.srs.model.LetterGrades;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class InstructorGradeMapper implements RowMapper<LetterGrades> {
    @Override
    public LetterGrades mapRow(ResultSet resultSet, int index) throws SQLException {
        LetterGrades lg = new LetterGrades();
        lg.setFirstname(resultSet.getString("firstname"));
        lg.setLastname(resultSet.getString("lastname"));
        lg.setFinal_grade(resultSet.getDouble("final_grade"));
        lg.setUser_id(resultSet.getLong("user_id"));
        return lg;
    }
}