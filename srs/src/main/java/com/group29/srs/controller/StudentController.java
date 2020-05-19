package com.group29.srs.controller;

import com.group29.srs.model.Grades;
import com.group29.srs.model.TakenCourses;
import com.group29.srs.model.WeeklySchedule;
import com.group29.srs.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentServices studentServices;

    @GetMapping("/{studentID}")
    public String getStudentMainPage(@PathVariable(value = "studentID") Long ID, Model model){
        ArrayList<TakenCourses> courses = (ArrayList<TakenCourses>) studentServices.getTakenCourses(ID, "spring", 2020);
        int[] availableCourses = new int[45];
        List<WeeklySchedule> scheduleCourses = studentServices.getStudentWeeklySchedule(ID, "spring", 2020  );
        model.addAttribute("student", studentServices.getStudentInfoById(ID).get(0) );
        model.addAttribute( "course_schedules", scheduleCourses);
        model.addAttribute("courses_taken", courses);
        for (int i=0; i<scheduleCourses.size(); i++){
            availableCourses[scheduleCourses.get(i).getTimeSlot()] = 1;
        }
        model.addAttribute("available", availableCourses);
        return "home-page";
    }


    @GetMapping("/{studentID}/grades")
    public String getStudentGrades(@PathVariable(value = "studentID") Long ID, Model model){
        List<Grades> stgrade = studentServices.getGrades("spring",ID,2020 );
        for(int i=0;i<stgrade.size();i++){
                System.out.println(stgrade.get(i).getTitle());
        }
        return "grades";
    }
}
