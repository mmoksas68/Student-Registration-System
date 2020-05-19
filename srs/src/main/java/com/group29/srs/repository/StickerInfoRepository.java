package com.group29.srs.repository;

import com.group29.srs.mappers.StickerInfoMapper;
import com.group29.srs.mappers.DriverInfoMapper;
import com.group29.srs.model.Driver_Info;
import com.group29.srs.model.Sticker_Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StickerInfoRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Driver_Info> getDriverInfoById(Long owner_id){
        return  jdbcTemplate.query("SELECT cs.driver_licence_no, u.firstname, u.lastname, cs.penalty_point " +
                "FROM User u " +
                "INNER JOIN Car_Sticker cs ON cs.owner_id= u.user_id " +
                "WHERE u.user_id = ?;",new Object[] {owner_id}, new DriverInfoMapper());
    }
    public List<Sticker_Info> getStickerInfoById(Long owner_id){
        return  jdbcTemplate.query("SELECT cs.sticker_id, cs.plate_no, cs.start_date, cs.car_type, cs.end_date " +
                "FROM User u " +
                "INNER JOIN Car_Sticker cs ON cs.owner_id = u.user_id "+
                "WHERE u.user_id = ?;",new Object[] {owner_id}, new StickerInfoMapper());
    }
}
