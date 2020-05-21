package com.group29.srs.repository;

import com.group29.srs.mappers.*;
import com.group29.srs.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class TeachingAssistantRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<TeachingAssistantGivenCourses> getTeachingAssistantGivenCourses(long id, String semester, int year){
        return  jdbcTemplate.query("SELECT distinct c.course_code, c.name " +
                "FROM TeachingAssistant ta " +
                "INNER JOIN Assists a ON a.ta_id = ta.ta_id " +
                "INNER JOIN Course c ON c.course_id = a.course_id " +
                "INNER JOIN Section sec ON c.course_id= sec.course_id " +
                "WHERE ta.ta_id= ? AND   " +
                "sec.semester= ? AND sec.year= ? ;",new Object[] {id, semester, year}, new TeachingAssistantGivenCoursesMapper());
    }

    public List<Ta_InstructorInfo> getTeachingAssistantInfoById(long id){
        return  jdbcTemplate.query("SELECT u.firstname, u.lastname, d.dept_name," +
                "ta.ta_id, ta.office_no, p.phone_number, u.mail " +
                "FROM TeachingAssistant ta " +
                "INNER JOIN User u ON ta.ta_id=u.user_id " +
                "INNER JOIN D_Member m ON u.user_id=m.user_id " +
                "INNER JOIN Department d ON m.dept_code = d.dept_code " +
                "INNER JOIN Phone p ON p.phone_id= u.user_id " +
                "WHERE ta.ta_id = ?;",new Object[] {id}, new TeachingAssistantInfoMapper());
    }

    public void insertTeachingAssistant(long id, String firstname, String lastname, String mail, String password,
                                        String office_no, String office_hours, String phone_number, String dept_code) {
        jdbcTemplate.update(
                "INSERT INTO User (user_id, firstname, lastname, mail, password) VALUES (?, ?, ?, ?, ?)",
                new Object[]{id, firstname, lastname,mail,password}
        );
        jdbcTemplate.update(
                "INSERT INTO TeachingAssistant (ta_id, office_no, office_hours) " +
                        "VALUES (?, ?, ?)",
                new Object[]{id, office_no, office_hours}
        );
        jdbcTemplate.update(
                "INSERT INTO Phone (phone_number, phone_id) VALUES( ?, ?)",
                new Object[]{phone_number, id}
        );
        jdbcTemplate.update(
                "INSERT INTO D_Member (dept_code, user_id) VALUES( ?, ?)",
                new Object[]{dept_code, id}
        );
    }

    public List<WeeklySchedule> getTeachingAssistantWeeklySchedule(long id, String semester, int year){
        return  jdbcTemplate.query("SELECT c.course_code, sec.section_number," +
                "sec.classroom, ts.start_day, ts.start_time, ts.end_time " +
                "FROM TeachingAssistant ta " +
                "INNER JOIN Assists a ON a.ta_id = ta.ta_id " +
                "INNER JOIN Course c ON c.course_id = a.course_id " +
                "INNER JOIN Section sec ON c.course_id= sec.course_id " +
                "INNER JOIN Has h ON sec.section_id = h.section_id AND sec.course_id = h.course_id " +
                "INNER JOIN TimeSlot ts ON ts.time_id = h.time_id " +
                "WHERE ta.ta_id= ? AND sec.semester= ? " +
                "AND sec.year= ?;",new Object[] {id, semester, year}, new WeeklyScheduleMapper());
    }

    public List<ButtonName> getButtonNames(long id, String semester, int year){
        return  jdbcTemplate.query("SELECT c.course_code, sec.section_number, c.name, sec.section_id, sec.course_id   " +
                "FROM TeachingAssistant ta " +
                "INNER JOIN Assists a ON a.ta_id=ta.ta_id " +
                "INNER JOIN Course c ON c.course_id = a.course_id " +
                "INNER JOIN Section sec ON c.course_id=sec.course_id " +
                "WHERE ta.ta_id= ? AND " +
                "sec.semester= ? AND sec.year= ?;",new Object[] {id, semester, year}, new ButtonNameMapper());
    }

    public List<AssignmentGrades> getStudents(long ta_id,String semester, int year){
        return  jdbcTemplate.query("SELECT distinct u.user_id, u.firstname, u.lastname, c.course_code, sec.section_number " +
                "FROM TeachingAssistant ta " +
                "INNER JOIN Assists asi ON ta.ta_id=asi.ta_id " +
                "INNER JOIN Course c ON c.course_id = asi.course_id " +
                "INNER JOIN Section sec ON sec.course_id = c.course_id " +
                "INNER JOIN Takes t on t.course_id = sec.course_id and t.section_id = sec.section_id " +
                "INNER JOIN Student s ON s.student_id = t.s_id " +
                "INNER JOIN User u ON s.student_id = u.user_id " +
                "WHERE ta.ta_id = ? " +
                "AND  t.semester= ? AND t.year= ?; ",new Object[] {ta_id,semester,year}, new TeachingAssistantGradeMapper());
    }


    public void setStudentGrades(long assignment_id, String title, String type, String date,
                                 Double average, Long course_id, Long section_id, int grade,Long student_id) {
        jdbcTemplate.update(
                "INSERT INTO Assignment (assignment_id, title, type, date, average,course_id, section_id) " +
                        "VALUES (?, ?, ?, ?, ?, ?, ?)",
                new Object[]{assignment_id, title, type, date, average, course_id, section_id}
        );
        jdbcTemplate.update("UPDATE Result r " +
                "SET grade = ? " +
                "WHERE r.student_id = ? AND r.assignment_id= ?; ",
                new Object[] {grade,student_id, assignment_id});
        }

    public List<Driver_Info> getDriverInfoById(Long owner_id){
        return  jdbcTemplate.query("SELECT cs.driver_licence_no, u.firstname, u.lastname, cs.penalty_point " +
                "FROM User u " +
                "INNER JOIN Car_Sticker cs ON cs.owner_id= u.user_id " +
                "WHERE u.user_id = ?;",new Object[] {owner_id}, new DriverInfoMapper());
    }
    public List<Sticker_Info> getStickerInfoById(Long owner_id){
        return  jdbcTemplate.query("SELECT cs.sticker_id, cs.plate_no, cs.start_date, cs.car_type, cs.end_date " +
                "FROM User u " +
                "INNER JOIN Car_Sticker cs ON cs.owner_id = u.user_id "+
                "WHERE u.user_id = ?;",new Object[] {owner_id}, new StickerInfoMapper());
    }
}
