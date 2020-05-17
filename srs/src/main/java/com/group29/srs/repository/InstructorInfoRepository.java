package com.group29.srs.repository;

import com.group29.srs.mappers.InstructorInfoMapper;
import com.group29.srs.model.Ta_InstructorInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InstructorInfoRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

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
                "INNER JOIN User u ON i.instructor_id=m.user_id " +
                "INNER JOIN Member m ON u.user_id=m.user_id " +
                "INNER JOIN Department d ON m.dept_code = d.dept_code " +
                "INNER JOIN Phone p ON p.phone_id= u.user_id " +
                "WHERE i.instructor_id = ?;",new Object[] {id}, new InstructorInfoMapper());
    }
}