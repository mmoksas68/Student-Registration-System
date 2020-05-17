package com.group29.srs.controller;

import com.group29.srs.services.StudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentInfoService studentInfoService;

    @GetMapping("/cs")
    public String getStudentMainPage(Model model){
        long id= 10000;
        model.addAttribute("students",  studentInfoService.getStudentInfoById(id));

        //model.addAttribute("students",  personService.getPersons());
        return "home-page";
    }
}
