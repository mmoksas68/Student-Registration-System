package com.group29.srs.repository;

import com.group29.srs.mappers.TakenCoursesMapper;
import com.group29.srs.model.TakenCourses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TakenCoursesRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<TakenCourses> getTakenCourses(long id, Enum semester, int year){
        return  jdbcTemplate.query("SELECT c.course_code, sec.section_number," +
                " c.name,u.firstname, u.lastname,c.credits FROM Student s " +
                "INNER JOIN Takes t ON t.student_id=s.student_id " +
                "INNER JOIN Section sec ON t.section_id=sec.section_id " +
                "INNER JOIN Course c ON c.course_id = sec.course_id " +
                "INNER JOIN Instructor i ON i.instructor_id= sec.teacher_id " +
                "INNER JOIN User u ON i.instructor_id=u.user_id " +
                "WHERE s.student_id= ? AND " +
                "t.semester= ? AND t.year= ?;",new Object[] {id, semester, year}, new TakenCoursesMapper());
    }
}