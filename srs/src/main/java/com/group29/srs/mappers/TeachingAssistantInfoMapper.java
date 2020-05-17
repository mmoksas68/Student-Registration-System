package com.group29.srs.mappers;

import com.group29.srs.model.Ta_InstructorInfo;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TeachingAssistantInfoMapper implements RowMapper<Ta_InstructorInfo> {
    @Override
    public Ta_InstructorInfo mapRow(ResultSet resultSet, int index) throws SQLException {
        Ta_InstructorInfo info = new Ta_InstructorInfo();
        info.setFirstname(resultSet.getString("firstname"));
        info.setLastname(resultSet.getString("lastname"));
        info.setMail(resultSet.getString("mail"));
        info.setDept_name(resultSet.getString("dept_name"));
        info.setPhone_number(resultSet.getString("phone_number"));
        info.setId(resultSet.getLong("ta_id"));
        info.setOffice_no(resultSet.getString("office_no"));
        return info;
    }
}