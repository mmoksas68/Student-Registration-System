package com.group29.srs.mappers;

import com.group29.srs.model.TeachingAssistantList;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class InstructorAssignMapper implements RowMapper<TeachingAssistantList> {
    @Override
    public TeachingAssistantList mapRow(ResultSet resultSet, int index) throws SQLException {
        TeachingAssistantList ta = new TeachingAssistantList();
        ta.setFirstname(resultSet.getString("firstname"));
        ta.setLastname(resultSet.getString("lastname"));
        ta.setTa_id(resultSet.getLong("ta_id"));
        return ta;
    }
}