package com.group29.srs.repository;

import com.group29.srs.mappers.ButtonNameMapper;
import com.group29.srs.mappers.StudentInfoMapper;
import com.group29.srs.mappers.TakenCoursesMapper;
import com.group29.srs.mappers.WeeklyScheduleMapper;
import com.group29.srs.model.ButtonName;
import com.group29.srs.model.StudentInfo;
import com.group29.srs.model.TakenCourses;
import com.group29.srs.model.WeeklySchedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<StudentInfo> getStudentInfoById(long id){
        /*String SQL = "SELECT u.firstname, u.lastname, d.dept_name,s.student_id, s.cgpa," +
                " s.gpa, s.current_semester,p.phone_number, u.mail" +
                " FROM Student s " +
                "INNER JOIN Member m ON u.user_id=m.user_id" +
                "INNER JOIN Department d ON m.dept_code = d.dept_code" +
                "INNER JOIN Phone p ON p.phone_id= u.user_id" +
                "WHERE s.student_id =  id;"; asdasd
        **/
        return  jdbcTemplate.query("SELECT u.firstname, u.lastname, d.dept_name," +
                "s.student_id, s.cgpa, s.gpa, s.current_semester," +
                "p.phone_number, u.mail " +
                "FROM Student s " +
                "INNER JOIN User u ON s.student_id=u.user_id " +
                "INNER JOIN D_Member m ON u.user_id=m.user_id " +
                "INNER JOIN Department d ON m.dept_code = d.dept_code " +
                "INNER JOIN Phone p ON p.phone_id= u.user_id " +
                "WHERE s.student_id = ?;",new Object[] {id}, new StudentInfoMapper());
    }

    public void insertStudent(long id, String firstname, String lastname, String mail, String password, String address, String gender, String birthday, String phone_number, String dept_code){
     /*   jdbcTemplate.update("INSERT INTO User (user_id, firstname, lastname, mail, password) VALUES (?, ?, ?, ?, ?)",
        new Object[]{id, firstname, lastname, mail, password});
        */
        jdbcTemplate.update(
                "INSERT INTO User (user_id, firstname, lastname, mail, password) VALUES (?, ?, ?, ?, ?)",
                new Object[]{id, firstname, lastname, mail, password});
        jdbcTemplate.update(
                "INSERT INTO Student (student_id, address, gpa, cgpa, erasmus_application_point, gender, date_of_birth, age, current_semester) " +
                        "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)",
                new Object[]{id, address, null , null, null, gender, birthday, null, null});
        jdbcTemplate.update(
                "INSERT INTO Phone (phone_number, phone_id) VALUES( ?, ?)",
                new Object[]{phone_number, id});
        jdbcTemplate.update(
                "INSERT INTO D_Member (dept_code, user_id) VALUES( ?, ?)",
                new Object[]{dept_code, id}
        );
    }

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

    public List<TakenCourses> getTakenCourses(long id, String semester, int year){
        return  jdbcTemplate.query("SELECT c.course_code, sec.section_number," +
                " c.name,u.firstname, u.lastname,c.credits FROM Student s " +
                "INNER JOIN Takes t ON t.s_id=s.student_id " +
                "INNER JOIN Section sec ON t.section_id=sec.section_id " +
                "INNER JOIN Course c ON c.course_id = sec.course_id " +
                "INNER JOIN Instructor i ON i.instructor_id= sec.teacher_id " +
                "INNER JOIN User u ON i.instructor_id=u.user_id " +
                "WHERE s.student_id= ? AND " +
                "t.semester= ? AND t.year= ?;",new Object[] {id, semester, year}, new TakenCoursesMapper());
    }

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
