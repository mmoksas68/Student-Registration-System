package com.group29.srs.controller;

import com.group29.srs.services.StudentSubmitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentSubmitService studentSubmitService;

    @GetMapping("/cs")
    public String getStudentMainPage(Model model){

        studentSubmitService.insertStudent(3300,"fatih","Sevban","fatih@gmail.com","12345",
                "almanya", "Male ","1997-11-18","05393334481", "CS");
        //model.addAttribute("students",  studentInfoService.getStudentInfoById(id));
        //model.addAttribute("students",  personService.getPersons());
        return "home-page";
    }
}
