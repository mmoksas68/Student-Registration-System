package com.group29.srs.repository;

import com.group29.srs.mappers.WeeklyScheduleMapper;
import com.group29.srs.model.WeeklySchedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InstructorWeeklyScheduleRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<WeeklySchedule> getInstructorWeeklySchedule(long id, String semester, int year){
        return  jdbcTemplate.query("SELECT c.course_code, sec.section_number," +
                "sec.class, ts.day, ts.start_time, ts.end_time " +
                "FROM Instructor i " +
                "INNER JOIN Section sec ON sec.teacher_id=i.instructor_id " +
                "INNER JOIN Course c ON c.course_id = sec.course_id " +
                "INNER JOIN TimeSlot ts ON ts.section_id = sec.section_id " +
                "WHERE i.instructor_id= ? AND sec.semester= ? " +
                "AND sec.year= ?;",new Object[] {id, semester, year}, new WeeklyScheduleMapper());
    }
}