package com.group29.srs.mappers;

import com.group29.srs.model.Sticker_Info;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StickerInfoMapper implements RowMapper<Sticker_Info> {
    @Override
    public Sticker_Info mapRow(ResultSet resultSet, int index) throws SQLException {
        Sticker_Info car_info = new Sticker_Info();
        car_info.setCar_type(resultSet.getString("car_type"));
        car_info.setEnd_date(resultSet.getString("end_date"));
        car_info.setPlate_no(resultSet.getString("plate_no"));
        car_info.setStart_date(resultSet.getString("start_date"));
        car_info.setSticker_id(resultSet.getLong("sticker_id"));
        return car_info;
    }
}