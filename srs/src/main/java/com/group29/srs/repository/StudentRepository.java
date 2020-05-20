package com.group29.srs.repository;

import com.group29.srs.mappers.*;
import com.group29.srs.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    UserRepository userRepository;

    public List<StudentInfo> getStudentInfoById(long id){
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

    public int insertStudent(String firstname, String lastname, String mail, String password,
                              String address, String gender, String birthday, String phone_number, String dept_code, String role){
        try{
            jdbcTemplate.update(
                    "INSERT INTO User (firstname, lastname, mail, password, role) VALUES (?, ?, ?, ?, ?)",
                    new Object[]{firstname, lastname, mail, password, role});
            MyUser user = userRepository.getUserByMail(mail);
            jdbcTemplate.update(
                    "INSERT INTO Student (student_id, address, gpa, cgpa, erasmus_application_point, gender, date_of_birth, age, current_semester) " +
                            "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)",
                    new Object[]{user.getUser_id(), address, null , null, null, gender, null, null, 1});
            jdbcTemplate.update(
                    "INSERT INTO Phone (phone_number, phone_id) VALUES( ?, ?)",
                    new Object[]{phone_number, user.getUser_id()});
            jdbcTemplate.update(
                    "INSERT INTO D_Member (dept_code, user_id) VALUES( ?, ?)",
                    new Object[]{dept_code, user.getUser_id()}
            );
            return 1;
        }catch (Exception e){
            e.printStackTrace();
            return 0;
        }

    }

    public List<WeeklySchedule> getStudentWeeklySchedule(long id, String semester, int year){
        return  jdbcTemplate.query("SELECT c.course_code, sec.section_number," +
                "sec.classroom, ts.start_day, ts.start_time, ts.end_time " +
                "FROM Student s " +
                "INNER JOIN Takes t ON t.s_id=s.student_id " +
                "INNER JOIN Section sec ON t.section_id=sec.section_id AND t.course_id=sec.course_id " +
                "INNER JOIN Course c ON c.course_id = sec.course_id " +
                "INNER JOIN Has h ON sec.section_id = h.section_id AND sec.course_id = h.course_id " +
                "INNER JOIN TimeSlot ts ON ts.time_id = h.time_id " +
                "WHERE s.student_id= ? AND " +
                "t.semester= ? AND t.year= ?;",new Object[] {id, semester, year}, new WeeklyScheduleMapper());
    }

    public List<TakenCourses> getTakenCourses(long id, String semester, int year){
        return  jdbcTemplate.query("SELECT c.course_code, sec.section_number," +
                " c.name,u.firstname, u.lastname,c.credits FROM Student s " +
                "INNER JOIN Takes t ON t.s_id=s.student_id " +
                "INNER JOIN Section sec ON t.section_id=sec.section_id AND t.course_id=sec.course_id " +
                "INNER JOIN Course c ON c.course_id = sec.course_id " +
                "INNER JOIN Instructor i ON i.instructor_id= sec.teacher_id " +
                "INNER JOIN User u ON i.instructor_id=u.user_id " +
                "WHERE s.student_id= ? AND " +
                "t.semester= ? AND t.year= ?;",new Object[] {id, semester, year}, new TakenCoursesMapper());
    }

    public List<ButtonName> getButtonNames(long id, String semester, int year){
        return  jdbcTemplate.query("SELECT c.course_code, sec.section_number, c.name, sec.course_id, sec.section_id" +
                "FROM Student s " +
                "INNER JOIN Takes t ON t.s_id=s.student_id " +
                "INNER JOIN Section sec ON t.section_id=sec.section_id AND t.course_id=sec.course_id " +
                "INNER JOIN Course c ON c.course_id = sec.course_id " +
                "WHERE s.student_id= ? AND " +
                "t.semester= ? AND t.year= ?;",new Object[] {id, semester, year}, new ButtonNameMapper());
    }

    public List<Grades> getGrades(String semester,long student_id, int year){
        return  jdbcTemplate.query("SELECT c.name ,a.title, a.type, a.date, r.grade " +
                "FROM Result r " +
                "INNER JOIN Student s ON r.student_id = s.student_id " +
                "INNER JOIN Assignment a ON a.assignment_id=r.assignment_id " +
                "INNER JOIN Contains con ON con.assignment_id=a.assignment_id " +
                "INNER JOIN Section sec ON con.section_id=sec.section_id AND con.course_id=sec.course_id " +
                "INNER JOIN Course c ON c.course_id = sec.course_id " +
                "INNER JOIN Takes t on t.section_id = sec.section_id AND t.s_id = s.student_id AND t.course_id = sec.course_id "+
                "WHERE sec.semester = ? AND s.student_id= ? AND sec.year = ?; ",new Object[] {semester, student_id, year}, new StudentGradeMapper());
    }
    public void updateStudent(long user_id, String password, String mail, String firstname, String lastname,
                              String address, String date_of_birth, String phone_number){
        jdbcTemplate.update(
                "UPDATE User " +
                        "SET firstname = ?, lastname= ?, mail= ?, password= ? " +
                        "WHERE user_id = ?;",
                new Object[]{firstname, lastname, mail, password, user_id}
        );

        jdbcTemplate.update(
                "UPDATE Student " +
                        "SET address= ? , date_of_birth= ? " +
                        "WHERE student_id = ?;",
                new Object[]{address, date_of_birth, user_id}
        );

        jdbcTemplate.update(
                "UPDATE Phone " +
                        "SET phone_number = ? " +
                        "WHERE phone_id = ?;",
                new Object[]{phone_number, user_id}
        );
    }

    public List<Exchange_School> getExchangeInfoById(Long id) {
        return jdbcTemplate.query("SELECT es.school_name,es.school_country,es.department, es.available_semester, s.erasmus_application_point " +
                "FROM Student s,ExchangeSchool es " +
                "WHERE s.student_id = ?;", new Object[]{id}, new ExchangeSchoolMapper());
    }


    public List<UnAvailableCourse> getUnAvailableCourses(long student_id){
        return  jdbcTemplate.query("Select * from " +
                "((Select c.course_id, c.course_code, c.name, cu.course_type " +
                "From Student s " +
                "Inner Join Takes t on t.s_id = s.student_id " +
                "Inner Join Course c on t.course_id = c.course_id " +
                "where s.student_id = ? and t.letter_grade is not null and t.letter_grade NOT LIKE 'F%') " +
                "UNION " +
                "(Select p.course_id, c.course_code, c.name, cu.course_type " +
                "From Student s " +
                "Inner Join User u on u.user_id = s.student_id " +
                "Inner Join D_Member dm on u.user_id = dm.user_id " +
                "Inner Join Department d on d.dept_code = dm.dept_code " +
                "Inner Join Curriculum cu on cu.dept_code = d.dept_code " +
                "Inner Join Course c on c.course_id = cu.course_id " +
                "Inner Join PreReq p on c.course_id = p.course_id " +
                "where student_id = ? AND p.req_id NOT in " +
                "(Select t.course_id " +
                "From Student s " +
                "Inner Join Takes t on t.s_id = s.student_id " +
                "where s.student_id = ? and t.letter_grade is not null and t.letter_grade NOT LIKE 'F%'))) as t; ",new Object[] {student_id, student_id, student_id}, new StudentUnAvailableCourseMapper());
    }

    public List<StudentRegistration> getAvailableCourses(long student_id){
        return  jdbcTemplate.query("Select c.course_id, c.course_code, c.name, course_type, sec.section_id, " +
                "u.firstname, u.lastname, sec.available_quota, sec.total_quota from " +
                "((Select c.course_id, c.course_code, c.name, cu.course_type " +
                "From Student s " +
                "Inner Join User u on u.user_id = s.student_id " +
                "Inner Join D_Member dm on u.user_id = dm.user_id " +
                "Inner Join Department d on d.dept_code = dm.dept_code " +
                "Inner Join Curriculum cu on cu.dept_code = d.dept_code " +
                "Inner Join Course c on c.course_id = cu.course_id " +
                "where student_id = ? and c.course_id not in " +
                "(Select p.course_id " +
                "From Student s " +
                "Inner Join User u on u.user_id = s.student_id " +
                "Inner Join D_Member dm on u.user_id = dm.user_id " +
                "Inner Join Department d on d.dept_code = dm.dept_code " +
                "Inner Join Curriculum cu on cu.dept_code = d.dept_code " +
                "Inner Join Course c on c.course_id = cu.course_id " +
                "Inner Join PreReq p on c.course_id = p.course_id " +
                "where student_id = ? )) " +
                "UNION " +
                "(Select p.course_id, c.course_code, c.name, cu.course_type " +
                "From Student s " +
                "Inner Join User u on u.user_id = s.student_id " +
                "Inner Join D_Member dm on u.user_id = dm.user_id " +
                "Inner Join Department d on d.dept_code = dm.dept_code " +
                "Inner Join Curriculum cu on cu.dept_code = d.dept_code " +
                "Inner Join Course c on c.course_id = cu.course_id " +
                "Inner Join PreReq p on c.course_id = p.course_id " +
                "where student_id = ? AND p.req_id in " +
                "(Select t.course_id " +
                "From Student s " +
                "Inner Join Takes t on t.s_id = s.student_id " +
                "where s.student_id = ? and t.letter_grade is not null and t.letter_grade NOT LIKE 'F%'))) as c " +
                "Inner Join Section sec on sec.course_id = c.course_id " +
                "Inner Join Instructor i on i.instructor_id = sec.teacher_id " +
                "Inner Join User u on u.user_id = i.instructor_id " +
                "where c.course_id not in (Select t.course_id " +
                "From Student s " +
                "Inner Join Takes t on t.s_id = s.student_id " +
                " where s.student_id = ? and t.letter_grade is not null and " +
                "t.letter_grade NOT LIKE 'F%'); ",new Object[] {student_id,student_id,student_id,student_id,student_id}, new StudentRegistrationMapper());
    }
}
