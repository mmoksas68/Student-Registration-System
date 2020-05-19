package com.group29.srs.services;

import com.group29.srs.model.Sticker_Info;
import com.group29.srs.model.Driver_Info;
import com.group29.srs.repository.StickerInfoRepository;
import com.group29.srs.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StickerServices {

    @Autowired
    StickerInfoRepository stickerRepository;

    public List<Sticker_Info> getStickerInfoById(Long ID){
        return  stickerRepository.getStickerInfoById(ID);
    }

    public List<Driver_Info> getDriverInfoById(Long ID){
        return  stickerRepository.getDriverInfoById(ID);
    }



}

