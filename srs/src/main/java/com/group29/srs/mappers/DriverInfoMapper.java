package com.group29.srs.mappers;

import com.group29.srs.model.Driver_Info;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DriverInfoMapper implements RowMapper<Driver_Info> {
    @Override
    public Driver_Info mapRow(ResultSet resultSet, int index) throws SQLException {
        Driver_Info driver_info = new Driver_Info();
        driver_info.setDriver_license_no(resultSet.getString("driver_licence_no"));
        driver_info.setFirstname(resultSet.getString("firstname"));
        driver_info.setLastname(resultSet.getString("lastname"));
        driver_info.setPenalty_point(resultSet.getLong("penalty_point"));
        return driver_info;
    }
}

