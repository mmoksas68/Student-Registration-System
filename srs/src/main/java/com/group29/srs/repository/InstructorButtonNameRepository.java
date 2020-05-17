package com.group29.srs.repository;

import com.group29.srs.mappers.ButtonNameMapper;
import com.group29.srs.model.ButtonName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InstructorButtonNameRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<ButtonName> getButtonNames(long id, String semester, int year){
        return  jdbcTemplate.query("SELECT c.course_code, sec.section_number, c.name " +
                "FROM Instructor i " +
                "INNER JOIN Section sec ON sec.teacher_id=i.instructor_id " +
                "INNER JOIN Course c ON c.course_id = sec.course_id " +
                "WHERE i.instructor_id= ? AND " +
                "sec.semester= ? AND sec.year= ? ;",new Object[] {id, semester, year}, new ButtonNameMapper());
    }
}