package com.group29.srs.controller;

import com.group29.srs.model.*;
import com.group29.srs.services.InstructorServices;
import com.group29.srs.services.TeachingAssistantServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/ta")
public class TaController {
    @Autowired
    TeachingAssistantServices teachingAssistantServices;

    @GetMapping("/{taID}")
    public String getStudentMainPage(@PathVariable(value = "taID") Long ID, Model model){
        ArrayList<TeachingAssistantGivenCourses> courses = (ArrayList<TeachingAssistantGivenCourses>) teachingAssistantServices.getTeachingAssistantGivenCourses(ID, "spring", 2020);
        model.addAttribute("courses_given", courses);
        int[] availableCourses = new int[45];
        List<WeeklySchedule> scheduleCourses = teachingAssistantServices.getTeachingAssistantWeeklySchedule(ID, "spring", 2020  );

        model.addAttribute( "course_schedules", scheduleCourses);

        for (int i=0; i<scheduleCourses.size(); i++){
            availableCourses[scheduleCourses.get(i).getTimeSlot()] = 1;
        }
        model.addAttribute("available", availableCourses);
        model.addAttribute("teaching_assistant", teachingAssistantServices.getTeachingAssistantInfoById(ID).get(0) );
        return "home-page-ta";
    }

    @GetMapping("/{taID}/car-stickers")
    public String getCarStickers(@PathVariable(value = "taID") Long ID, Model model){
        Driver_Info driver = teachingAssistantServices.getDriverInfoById(ID).get(0);
        System.out.println(driver);
        List<Sticker_Info> stickers = (List<Sticker_Info>) teachingAssistantServices.getStickerInfoById(ID);
        for (int i=0; i < stickers.size(); i++){
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date car_date = dateFormat.parse(stickers.get(i).getEnd_date(),new ParsePosition(0));
            Date cur_date = new Date();

            if((car_date.compareTo(cur_date) >= 0) && driver.getPenalty_point() < 16)
                stickers.get(i).setIsActive(1);
            else
                stickers.get(i).setIsActive(0);
            System.out.println(stickers.get(i));
        }
        model.addAttribute("driver", driver);
        model.addAttribute("stickers", stickers);
        model.addAttribute("teaching_assistant", teachingAssistantServices.getTeachingAssistantInfoById(ID).get(0) );
        return "car-sticker";
    }

    @GetMapping("/{instructorID}/submit-grades")
    public String getSubmitGradess(@PathVariable(value = "instructorID") Long ID, Model model){
        model.addAttribute("teaching_assistant", teachingAssistantServices.getTeachingAssistantInfoById(ID).get(0) );
        return "submit-grades";
    }
}
