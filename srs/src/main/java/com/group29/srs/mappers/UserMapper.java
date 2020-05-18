package com.group29.srs.mappers;

import com.group29.srs.model.MyUser;
import com.group29.srs.model.UserRole;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<MyUser> {

    @Override
    public MyUser mapRow(ResultSet resultSet, int i) throws SQLException {
        MyUser myUser = new MyUser();
        myUser.setUser_id(resultSet.getLong("user_id"));
        myUser.setFirstname(resultSet.getString("firstname"));
        myUser.setLastname(resultSet.getString("lastname"));
        myUser.setMail(resultSet.getString("mail"));
        myUser.setPassword(resultSet.getString("password"));
        myUser.setRole(new UserRole(resultSet.getString("role")));
        return myUser;
    }
}
