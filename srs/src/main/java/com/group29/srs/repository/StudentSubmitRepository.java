package com.group29.srs.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.sql.Types;

@Repository
public class StudentSubmitRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void insertStudent(long id, String firstname, String lastname, String mail, String password, String address, String gender, Date birthday, String phone_number){
     /*   jdbcTemplate.update("INSERT INTO User (user_id, firstname, lastname, mail, password) VALUES (?, ?, ?, ?, ?)",
        new Object[]{id, firstname, lastname, mail, password});
        */
        jdbcTemplate.update(
                "INSERT INTO User (user_id, firstname, lastname, mail, password) VALUES (?, ?, ?, ?, ?)",
                new Object[]{id, firstname, lastname, mail, password}, new Object[]{Types.INTEGER, Types.VARCHAR, Types.VARCHAR , Types.VARCHAR , Types.VARCHAR }
        );
        jdbcTemplate.update(
                "INSERT INTO Student (student_id, address, gpa, cpga, erasmus_application_point, gender, date_of_birth, age, current_semester) " +
                        "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)",
                new Object[]{id, address, null , null, null, gender, birthday, null, null},
                new Object[]{Types.INTEGER, Types.VARCHAR, Types.NUMERIC , Types.NUMERIC , Types.NUMERIC, Types.VARCHAR ,Types.DATE ,Types.TINYINT,Types.TINYINT }
        );
        jdbcTemplate.update(
                "INSERT INTO Phone (phone_number, phone_id) VALUES( ?, ?)",
                new Object[]{phone_number,id}, new Object[]{Types.VARCHAR, Types.INTEGER }
        );
    }
}