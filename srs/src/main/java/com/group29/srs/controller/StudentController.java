package com.group29.srs.controller;

import com.group29.srs.model.*;
import com.group29.srs.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
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
        ArrayList<ArrayList<Grades>> stgrade = studentServices.getGrades("spring",ID,2020 );
        model.addAttribute("student", studentServices.getStudentInfoById(ID).get(0) );
        model.addAttribute("grades", stgrade);

        return "grades";
    }

    @GetMapping("/{studentID}/exchange")
    public String getExchange(@PathVariable(value = "studentID") Long ID,
                              @ModelAttribute("application") ExchangeApplication exchangeApplication,
                              Model model){
        List<Exchange_School> exchange_schools = studentServices.getExchangeInfoById(ID);
        model.addAttribute("exchange_schools", exchange_schools);
        model.addAttribute("student", studentServices.getStudentInfoById(ID).get(0) );
        return "exchange";
    }

    @PostMapping("/{studentID}/exchange")
    public String postExchange(@PathVariable(value = "studentID") Long ID,
                               @ModelAttribute("application") ExchangeApplication exchangeApplication,
                                Model model){
        System.out.println("post achieved");
        System.out.println(exchangeApplication);
        return "redirect:/student/"+ID;
    }

    @GetMapping("/{studentID}/course-registration")
    public String getRegister(@PathVariable(value = "studentID") Long ID, Model model){
        List<StudentRegistration> courses = studentServices.getRegistrableCourses(ID);
        List<AvailableCourse> availableCourses = new ArrayList<>();
        for (int i=0 ; i <courses.size(); i++){
            List<AvailableCourse> availableSections = studentServices.getAvailableCourses(courses.get(i).getCourse_id());
            for(int j=0; j < availableSections.size(); j++){
                availableCourses.add(availableSections.get(j));
            }
            System.out.println(courses.get(i));
        }
        ArrayList<TakenCourses> courses_taken = (ArrayList<TakenCourses>) studentServices.getTakenCourses(ID, "spring", 2020);
        int[] availableSlots = new int[45];
        List<WeeklySchedule> scheduleCourses = studentServices.getStudentWeeklySchedule(ID, "spring", 2020  );
        for (int i=0; i<scheduleCourses.size(); i++){
            availableSlots[scheduleCourses.get(i).getTimeSlot()] = 1;
        }
        model.addAttribute("student", studentServices.getStudentInfoById(ID).get(0) );
        model.addAttribute("courses", courses);
        model.addAttribute( "course_schedules", scheduleCourses);
        model.addAttribute("courses_taken", courses_taken);
        model.addAttribute("available_courses", availableCourses);
        model.addAttribute("available", availableSlots);
        return "register";
    }

    @GetMapping("/{studentID}/course-registration/{courseCode}/{sectionID}")
    public String registerToCourse(@PathVariable(value = "studentID") Long ID,
                                   @PathVariable(value = "studentID") Long courseCode,
                                   @PathVariable(value = "studentID") Long sectionID,
                                   Model model){


        return "redirect:/student/"+ID+"/course-registration";
    }

}
