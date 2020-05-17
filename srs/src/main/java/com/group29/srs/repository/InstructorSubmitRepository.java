package com.group29.srs.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class InstructorSubmitRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

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
}