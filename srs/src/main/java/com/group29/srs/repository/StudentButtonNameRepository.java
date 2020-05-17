package com.group29.srs.repository;

import com.group29.srs.mappers.ButtonNameMapper;
import com.group29.srs.model.ButtonName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentButtonNameRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<ButtonName> getButtonNames(long id, String semester, int year){
        return  jdbcTemplate.query("SELECT c.course_code, sec.section_number, c.name " +
                "FROM Student s " +
                "INNER JOIN Takes t ON t.s_id=s.student_id " +
                "INNER JOIN Section sec ON t.section_id=sec.section_id " +
                "INNER JOIN Course c ON c.course_id = sec.course_id " +
                "WHERE s.student_id= ? AND " +
                "sec.semester= ? AND sec.year= ?;",new Object[] {id, semester, year}, new ButtonNameMapper());
    }
}