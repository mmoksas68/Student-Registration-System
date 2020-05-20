package com.group29.srs.repository;

import com.group29.srs.mappers.UserMapper;
import com.group29.srs.model.MyUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public MyUser getUserByIdAndPassword(long ID, String password){

        List<MyUser> myUsers = jdbcTemplate.query("SELECT u.user_id, u.firstname, u.lastname, u.mail, u.password, u.role " +
                "FROM User u " +
                "WHERE u.user_id = ? AND u.password = ?;",new Object[] {ID, password}, new UserMapper());

        if (myUsers.isEmpty())
            return null;
        else
            return myUsers.get(0);
    }

    public MyUser getUserById(long ID){
        List<MyUser> myUsers = jdbcTemplate.query("SELECT u.user_id, u.firstname, u.lastname, u.mail, u.password, u.role " +
                "FROM User u " +
                "WHERE u.user_id = ?;",new Object[] {ID}, new UserMapper());
        if (myUsers.isEmpty())
            return null;
        else
            return myUsers.get(0);
    }
}
