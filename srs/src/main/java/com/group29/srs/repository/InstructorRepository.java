package com.group29.srs.repository;

import com.group29.srs.mappers.ButtonNameMapper;
import com.group29.srs.mappers.InstructorGivenCoursesMapper;
import com.group29.srs.mappers.InstructorInfoMapper;
import com.group29.srs.mappers.WeeklyScheduleMapper;
import com.group29.srs.model.ButtonName;
import com.group29.srs.model.InstructorGivenCourses;
import com.group29.srs.model.Ta_InstructorInfo;
import com.group29.srs.model.WeeklySchedule;
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
        /*String SQL = "SELECT u.firstname, u.lastname, d.dept_name,s.student_id, s.cgpa," +
                " s.gpa, s.current_semester,p.phone_number, u.mail" +
                " FROM Student s " +
                "INNER JOIN Member m ON u.user_id=m.user_id" +
                "INNER JOIN Department d ON m.dept_code = d.dept_code" +
                "INNER JOIN Phone p ON p.phone_id= u.user_id" +
                "WHERE s.student_id =  id;"; asdasd
        **/
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
                "INNER JOIN Has h ON sec.section_id = h.section_id " +
                "INNER JOIN TimeSlot ts ON ts.time_id = h.time_id " +
                "WHERE i.instructor_id= ? AND sec.semester= ? " +
                "AND sec.year= ?;",new Object[] {id, semester, year}, new WeeklyScheduleMapper());
    }

    public List<ButtonName> getButtonNames(long id, String semester, int year){
        return  jdbcTemplate.query("SELECT c.course_code, sec.section_number, c.name " +
                "FROM Instructor i " +
                "INNER JOIN Section sec ON sec.teacher_id=i.instructor_id " +
                "INNER JOIN Course c ON c.course_id = sec.course_id " +
                "WHERE i.instructor_id= ? AND " +
                "sec.semester= ? AND sec.year= ? ;",new Object[] {id, semester, year}, new ButtonNameMapper());
    }

}
