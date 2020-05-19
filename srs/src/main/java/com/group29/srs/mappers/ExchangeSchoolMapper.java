package com.group29.srs.mappers;

import com.group29.srs.model.Exchange_School;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ExchangeSchoolMapper implements RowMapper<Exchange_School> {
    @Override
    public Exchange_School mapRow(ResultSet resultSet, int index) throws SQLException {
        Exchange_School ex = new Exchange_School();
        ex.setSchool_name(resultSet.getString("school_name"));
        ex.setSchool_country(resultSet.getString("school_country"));
        ex.setDepartment(resultSet.getString("department"));
        ex.setAvailable_semester(resultSet.getString("available_semester"));
        ex.setErasmus_application_point(resultSet.getDouble("erasmus_application_point"));
        return ex;
    }
}
