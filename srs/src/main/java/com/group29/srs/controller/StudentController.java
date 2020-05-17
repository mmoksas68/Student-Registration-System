package com.group29.srs.controller;

import com.group29.srs.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/cs")
    public String getStudentMainPage(Model model){
        model.addAttribute("students",  studentService.getStudents());
        return "home-page";
    }
}
