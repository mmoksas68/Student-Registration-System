package com.group29.srs.mappers;

import com.group29.srs.model.StudentInfo;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentInfoMapper implements RowMapper<StudentInfo> {
    @Override
    public StudentInfo mapRow(ResultSet resultSet, int index) throws SQLException {
        StudentInfo stinfo = new StudentInfo();
        stinfo.setFirstname(resultSet.getString("firstname"));
        stinfo.setLastname(resultSet.getString("lastname"));
        stinfo.setMail(resultSet.getString("mail"));
        stinfo.setDept_name(resultSet.getString("dept_name"));
        stinfo.setPhone_number(resultSet.getString("phone_number"));
        stinfo.setStudent_id(resultSet.getLong("student_id"));
        stinfo.setGpa(resultSet.getDouble("gpa"));
        stinfo.setCgpa(resultSet.getDouble("cgpa"));
        stinfo.setCurrent_semester(resultSet.getString("current_semester"));
        stinfo.setIsAppliedErasmus(resultSet.getBoolean("is_Applied_Erasmus"));
        return stinfo;
    }
}