package com.group29.srs.repository;

import com.group29.srs.mappers.TeachingAssistantGivenCoursesMapper;
import com.group29.srs.model.TeachingAssistantGivenCourses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TeachingAssistantGivenCoursesRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<TeachingAssistantGivenCourses> getTeachingAssistantGivenCourses(long id, String semester, int year){
        return  jdbcTemplate.query("SELECT c.course_code, c.name, sec.class, u.firstname, u.lastname " +
                "FROM TeachingAssistant ta " +
                "INNER JOIN Assists a ON a.ta_id = ta.ta_id " +
                "INNER JOIN Course c ON c.course_id = a.course_id " +
                "INNER JOIN Section sec ON c.course_id= sec.course_id " +
                "INNER JOIN Instructor i ON i.instructor_id= sec.teacher_id " +
                "INNER JOIN User u ON i.instructor_id=u.user_id " +
                "WHERE ta.ta_id= ? AND  " +
                "sec.semester= ? AND sec.year= ? ;",new Object[] {id, semester, year}, new TeachingAssistantGivenCoursesMapper());
    }
}