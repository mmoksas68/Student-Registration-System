package com.group29.srs.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.sql.Types;

@Repository
public class TeachingAssistantSubmitRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void insertTeachingAssistant(long id, String firstname, String lastname, String mail, String password, String office_no, String office_hours, String gender, Date birthday, String phone_number) {
     /*   jdbcTemplate.update("INSERT INTO User (user_id, firstname, lastname, mail, password) VALUES (?, ?, ?, ?, ?)",
        new Object[]{id, firstname, lastname, mail, password});
        */
        jdbcTemplate.update(
                "INSERT INTO User (user_id, firstname, lastname, mail, password) VALUES (?, ?, ?, ?, ?)",
                new Object[]{id, firstname, lastname, mail, password}, new Object[]{Types.INTEGER, Types.VARCHAR, Types.VARCHAR, Types.VARCHAR, Types.VARCHAR}
        );
        jdbcTemplate.update(
                "INSERT INTO TeachingAssistant (ta_id, office_no, office_hours) " +
                        "VALUES (?, ?, ?)",
                new Object[]{id, office_no, office_hours, null, null, gender, birthday, null, null},
                new Object[]{Types.INTEGER, Types.VARCHAR, Types.VARCHAR, Types.NUMERIC, Types.NUMERIC, Types.VARCHAR, Types.DATE, Types.TINYINT, Types.TINYINT}
        );
        jdbcTemplate.update(
                "INSERT INTO Phone (phone_number, phone_id) VALUES( ?, ?)",
                new Object[]{phone_number, id}, new Object[]{Types.VARCHAR, Types.INTEGER}
        );
    }
}