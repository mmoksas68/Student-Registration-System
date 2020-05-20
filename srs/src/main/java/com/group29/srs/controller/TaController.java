package com.group29.srs.controller;

import com.group29.srs.services.InstructorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ta")
public class TaController {
    @Autowired
    InstructorServices instructorServices;

    @GetMapping("/{taID}")
    public String getStudentMainPage(@PathVariable(value = "taID") Long ID, Model model){
      /*  ArrayList<TakenCourses> courses = (ArrayList<TakenCourses>) studentServices.getTakenCourses(ID, "spring", 2020);
        int[] availableCourses = new int[45];
        List<WeeklySchedule> scheduleCourses = studentServices.getStudentWeeklySchedule(ID, "spring", 2020  );

        model.addAttribute( "course_schedules", scheduleCourses);
        model.addAttribute("courses_taken", courses);
        for (int i=0; i<scheduleCourses.size(); i++){
            availableCourses[scheduleCourses.get(i).getTimeSlot()] = 1;
        }
        model.addAttribute("available", availableCourses);*/
        model.addAttribute("instructor", instructorServices.getInstructorInfoById(ID).get(0) );
        return "home-page-inst";
    }
}
