package com.group29.srs.controller;


import com.group29.srs.model.Student;
import com.group29.srs.model.StudentInfo;
import com.group29.srs.model.TakenCourses;
import com.group29.srs.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;


@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentServices studentServices;

    @GetMapping("/{studentID}")
    public String getStudentMainPage(@PathVariable(value = "studentID") Long ID, Model model){
        ArrayList<TakenCourses> courses = (ArrayList<TakenCourses>) studentServices.getTakenCourses(ID, "spring", 2020);
        model.addAttribute("student", studentServices.getStudentInfoById(ID).get(0) );
        model.addAttribute( "course_schedules", studentServices.getStudentWeeklySchedule(ID, "spring", 2020  ));
        model.addAttribute("courses_taken", courses);
        for(int i=0; i<courses.size(); i++){
            System.out.println(courses.get(i).toString());
        }

        return "home-page";
    }
}
