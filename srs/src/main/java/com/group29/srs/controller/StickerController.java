package com.group29.srs.controller;

import com.group29.srs.model.Sticker_Info;
import com.group29.srs.model.Driver_Info;
import com.group29.srs.services.StickerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/sticker")
public class StickerController {

    @Autowired
    StickerServices stickerServices;
    private Boolean isActive;

    @GetMapping("/{studentID}")
    public String getStickerPage(@PathVariable(value = "studentID") Long ID, Model model){
        //ArrayList<TakenCourses> courses = (ArrayList<TakenCourses>) stickerServices.getTakenCourses(ID, "spring", 2020);
        //model.addAttribute("student", stickerServices.getDriverInfoById(ID).get(0) );
        //model.addAttribute( "course_schedules", stickerServices.getStickerInfoById(ID, "spring", 2020  ));
        //model.addAttribute("courses_taken", courses);
        List<Driver_Info> driver = (List<Driver_Info>) stickerServices.getDriverInfoById(ID);
        List<Sticker_Info> sticker = (List<Sticker_Info>) stickerServices.getStickerInfoById(ID);
        System.out.println("Driver_license_no: " + driver.get(0).getDriver_license_no());
        System.out.println("Firstname: " + driver.get(0).getFirstname());
        System.out.println("Lastname: " + driver.get(0).getLastname());
        System.out.println("Penalty_point: " +driver.get(0).getPenalty_point());
        System.out.println("Sticker_id: " +sticker.get(0).getSticker_id());
        System.out.println("Plate_no: " +sticker.get(0).getPlate_no());
        System.out.println("Start_date: " +sticker.get(0).getStart_date());
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date car_date = dateFormat.parse(sticker.get(0).getEnd_date(),new ParsePosition(0));
        Date cur_date = new Date();

        if((car_date.compareTo(cur_date) >= 0) && driver.get(0).getPenalty_point() < 16)
            isActive = Boolean.TRUE;
        else
            isActive = Boolean.FALSE;

        System.out.println("isActive : " + isActive);
        System.out.println("Car_type : " + sticker.get(0).getCar_type());
        return "home-page";
    }
}


