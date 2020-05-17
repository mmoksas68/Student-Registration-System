package com.group29.srs.repository;

import com.group29.srs.mappers.TeachingAssistantInfoMapper;
import com.group29.srs.model.Ta_InstructorInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TeachingAssistantInfoRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Ta_InstructorInfo> getTeachingAssistantInfoById(long id){
        /*String SQL = "SELECT u.firstname, u.lastname, d.dept_name,s.student_id, s.cgpa," +
                " s.gpa, s.current_semester,p.phone_number, u.mail" +
                " FROM Student s " +
                "INNER JOIN Member m ON u.user_id=m.user_id" +
                "INNER JOIN Department d ON m.dept_code = d.dept_code" +
                "INNER JOIN Phone p ON p.phone_id= u.user_id" +
                "WHERE s.student_id =  id;"; asdasd
        **/
        return  jdbcTemplate.query("SELECT u.firstname, u.lastname, d.dept_name," +
                "ta.ta_id, ta.office_no, p.phone_number, u.mail " +
                "FROM TeachingAssistant ta " +
                "INNER JOIN User u ON ta.ta_id=u.user_id " +
                "INNER JOIN D_Member m ON u.user_id=m.user_id " +
                "INNER JOIN Department d ON m.dept_code = d.dept_code " +
                "INNER JOIN Phone p ON p.phone_id= u.user_id " +
                "WHERE ta.ta_id = ?;",new Object[] {id}, new TeachingAssistantInfoMapper());
    }
}