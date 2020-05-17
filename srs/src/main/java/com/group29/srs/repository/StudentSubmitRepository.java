package com.group29.srs.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentSubmitRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

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
}