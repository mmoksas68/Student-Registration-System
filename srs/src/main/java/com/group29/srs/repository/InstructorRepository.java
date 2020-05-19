package com.group29.srs.repository;

import com.group29.srs.mappers.*;
import com.group29.srs.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InstructorRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<InstructorGivenCourses> getInstructorGivenCourses(long id, String semester, int year){
        return  jdbcTemplate.query("SELECT c.course_code, sec.section_number, c.name,sec.classroom " +
                "FROM Instructor i " +
                "INNER JOIN Section sec ON sec.teacher_id=i.instructor_id " +
                "INNER JOIN Course c ON c.course_id = sec.course_id " +
                "WHERE i.instructor_id= ? AND " +
                "sec.semester= ? AND sec.year= ? ;",new Object[] {id, semester, year}, new InstructorGivenCoursesMapper());
    }

    public List<Ta_InstructorInfo> getInstructorInfoById(long id){
        return  jdbcTemplate.query("SELECT u.firstname, u.lastname, d.dept_name," +
                "i.instructor_id, i.office_no, p.phone_number, u.mail " +
                "FROM Instructor i " +
                "INNER JOIN User u ON i.instructor_id= u.user_id " +
                "INNER JOIN D_Member m ON u.user_id=m.user_id " +
                "INNER JOIN Department d ON m.dept_code = d.dept_code " +
                "INNER JOIN Phone p ON p.phone_id= u.user_id " +
                "WHERE i.instructor_id = ?;",new Object[] {id}, new InstructorInfoMapper());
    }

    public void insertInstructor(long id, String firstname, String lastname, String mail, String password, String office_no, String office_hours, String phone_number,String dept_code) {
        jdbcTemplate.update("INSERT INTO User (user_id, firstname, lastname, mail, password) VALUES (?, ?, ?, ?, ?)",
                new Object[]{id, firstname, lastname, mail, password});
        jdbcTemplate.update(
                "INSERT INTO Instructor (instructor_id, office_no, office_hours) " +
                        "VALUES (?, ?, ?)",
                new Object[]{id, office_no, office_hours});
        jdbcTemplate.update(
                "INSERT INTO Phone (phone_number, phone_id) VALUES( ?, ?)",
                new Object[]{phone_number, id});
        jdbcTemplate.update(
                "INSERT INTO D_Member (dept_code, user_id) VALUES( ?, ?)",
                new Object[]{dept_code, id}
        );
    }

    public List<WeeklySchedule> getInstructorWeeklySchedule(long id, String semester, int year){
        return  jdbcTemplate.query("SELECT c.course_code, sec.section_number," +
                "sec.classroom, ts.start_day, ts.start_time, ts.end_time " +
                "FROM Instructor i " +
                "INNER JOIN Section sec ON sec.teacher_id=i.instructor_id " +
                "INNER JOIN Course c ON c.course_id = sec.course_id " +
                "INNER JOIN Has h ON sec.section_id = h.section_id AND sec.course_id= h.course_id" +
                "INNER JOIN TimeSlot ts ON ts.time_id = h.time_id " +
                "WHERE i.instructor_id= ? AND sec.semester= ? " +
                "AND sec.year= ?;",new Object[] {id, semester, year}, new WeeklyScheduleMapper());
    }

    public List<ButtonName> getButtonNames(long id, String semester, int year){
        return  jdbcTemplate.query("SELECT c.course_code, sec.section_number, c.name, sec.section_id, sec.course_id " +
                "FROM Instructor i " +
                "INNER JOIN Section sec ON sec.teacher_id=i.instructor_id " +
                "INNER JOIN Course c ON c.course_id = sec.course_id " +
                "WHERE i.instructor_id= ? AND " +
                "sec.semester= ? AND sec.year= ? ;",new Object[] {id, semester, year}, new ButtonNameMapper());
    }

    public List<LetterGrades> getGrades(long instructor_id, String semester, int year){
        return  jdbcTemplate.query("SELECT u.user_id, u.firstname, u.lastname, t.final_grade, c.course_code, sec.section_id  " +
                "FROM Section sec " +
                "INNER JOIN Course c ON sec.course_id = c.course_id " +
                "INNER JOIN Instructor i ON sec.teacher_id = i.instructor_id " +
                "INNER JOIN Takes t ON t.section_id = sec.section_id AND t.course_id=sec.course_id " +
                "INNER JOIN Student s ON s.student_id = t.s_id " +
                "INNER JOIN User u ON s.student_id = u.user_id " +
                "WHERE i.instructor_id = ? AND t.semester= ? AND t.year= ?; ",new Object[] {instructor_id, semester, year}, new InstructorGradeMapper());
    }

    //buna tekrar bakmak gerekebilir
    public void setLetterGrades(long section_id, String letter_grade, long s_id,String semester,int year){
        jdbcTemplate.update("UPDATE Takes t " +
                "SET letter_grade = ? " +
                "WHERE t.section_id = ? AND t.s_id = ?  AND t.semester = ?  AND t.year = ?; ",new Object[] {section_id,letter_grade, s_id, semester, year});
    }

    public List<TeachingAssistantList> getTeachingAssistants(long instructor_id, String semester, int year){
        return  jdbcTemplate.query("SELECT ta.ta_id, u.firstname, u.lastname, c.course_code, sec.section_id " +
                "FROM Instructor i " +
                "INNER JOIN Authorizes a ON i.instructor_id = a.instructor_id " +
                "INNER JOIN Task t ON t.task_id=a.task_id " +
                "INNER JOIN TeachingAssistant ta ON ta.ta_id=a.ta_id " +
                "INNER JOIN Assist asi ON asi.ta_id=ta.ta_id " +
                "INNER JOIN Course c ON c.course_id=asi.course_id " +
                "INNER JOIN Section sec ON sec.teacher_id = i.instructor_id " +
                "INNER JOIN User u ON u.user_id = ta.ta_id " +
                "WHERE i.instructor_id = ? AND sec.semester= ? AND sec.year= ?; ",new Object[] {instructor_id,semester, year}, new InstructorAssignMapper());
    }
    public void assignTask(long task_id, String task_type, long instructor_id, long ta_id){
        jdbcTemplate.update(
                "INSERT INTO Task (task_id, task_type) VALUES( ?, ?)",
                new Object[]{task_id, task_type}
        );

        jdbcTemplate.update(
                "INSERT INTO Authorizes (task_id, instructor_id, ta_id ) VALUES( ?, ?, ?)",
                new Object[]{task_id, instructor_id, ta_id}
        );
    }
}
