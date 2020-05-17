package com.group29.srs.mappers;

import com.group29.srs.model.WeeklySchedule;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class WeeklyScheduleMapper implements RowMapper<WeeklySchedule> {
    @Override
    public WeeklySchedule mapRow(ResultSet resultSet, int index) throws SQLException {
        WeeklySchedule ws = new WeeklySchedule();
        ws.setCourse_code(resultSet.getString("course_code"));
        ws.setSection_number(resultSet.getInt("section_number"));
        ws.setEnd_time(resultSet.getTime("end_time"));
        ws.setStart_time(resultSet.getTime("start_time"));
        ws.setStart_day(resultSet.getString("start_day"));
        ws.setClassroom(resultSet.getString("classroom"));
        return ws;
    }
}