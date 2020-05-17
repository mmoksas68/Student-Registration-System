package com.group29.srs.repository;

import com.group29.srs.mappers.WeeklyScheduleMapper;
import com.group29.srs.model.WeeklySchedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentWeeklyScheduleRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<WeeklySchedule> getStudentWeeklySchedule(long id, String semester, int year){
        return  jdbcTemplate.query("SELECT c.course_code, sec.section_number," +
                "sec.classroom, ts.start_day, ts.start_time, ts.end_time " +
                "FROM Student s " +
                "INNER JOIN Takes t ON t.s_id=s.student_id " +
                "INNER JOIN Section sec ON t.section_id=sec.section_id " +
                "INNER JOIN Course c ON c.course_id = sec.course_id " +
                "INNER JOIN Has h ON sec.section_id = h.section_id " +
                "INNER JOIN TimeSlot ts ON ts.time_id = h.time_id " +
                "WHERE s.student_id= ? AND " +
                "t.semester= ? AND t.year= ?;",new Object[] {id, semester, year}, new WeeklyScheduleMapper());
    }
}