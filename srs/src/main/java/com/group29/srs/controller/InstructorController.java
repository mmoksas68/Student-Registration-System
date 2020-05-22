package com.group29.srs.controller;

import com.group29.srs.model.*;
import com.group29.srs.services.InstructorServices;
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
@RequestMapping("/instructor")
public class InstructorController {
    @Autowired
    InstructorServices instructorServices;

    @GetMapping("/{instructorID}")
    public String getStudentMainPage(@PathVariable(value = "instructorID") Long ID, Model model){
        ArrayList<InstructorGivenCourses> courses = (ArrayList< InstructorGivenCourses>) instructorServices.getTakenCourses(ID, "spring", 2020);
        model.addAttribute("courses_given", courses);
        int[] availableCourses = new int[45];
        List<WeeklySchedule> scheduleCourses = instructorServices.getInstructorWeeklySchedule(ID, "spring", 2020  );

        model.addAttribute( "course_schedules", scheduleCourses);

        for (int i=0; i<scheduleCourses.size(); i++){
            availableCourses[scheduleCourses.get(i).getTimeSlot()] = 1;
        }
        model.addAttribute("available", availableCourses);
        model.addAttribute("instructor", instructorServices.getInstructorInfoById(ID).get(0) );
        return "home-page-inst";
    }

    @GetMapping("/{instructorID}/list-tas")
    public String getTAList(@PathVariable(value = "instructorID") Long ID, Model model){
        ArrayList<ArrayList<TeachingAssistantList>> tas = instructorServices.getTeachingAssistants(ID,"spring",2020 );
        model.addAttribute("instructor", instructorServices.getInstructorInfoById(ID).get(0) );
        model.addAttribute("ta_list", tas);
        return "list-tas";
    }

    @GetMapping("/{instructorID}/submit-course-grades")
    public String getSubmitGrades(@PathVariable(value = "instructorID") Long ID, Model model){
        ArrayList<ArrayList<LetterGrades>> course_grades = instructorServices.getGrades(ID, "spring", 2020);
        model.addAttribute("instructor", instructorServices.getInstructorInfoById(ID).get(0) );
        model.addAttribute("course_grades", course_grades);
        return "assign-letter-grades";
    }


}
