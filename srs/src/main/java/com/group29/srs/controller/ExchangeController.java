package com.group29.srs.controller;

import com.group29.srs.model.Exchange_School;
import com.group29.srs.services.ExchangeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/exchange")
public class ExchangeController {

    @Autowired
    ExchangeServices exchangeServices;

    @GetMapping("/{studentID}")
    public List<Exchange_School>  getStudentMainPage(@PathVariable(value = "studentID") Long ID, Model model) {

        List<Exchange_School> scheduleCourses = exchangeServices.getExchangeInfoById(ID);
        System.out.println(scheduleCourses.get(0).getDepartment());
        System.out.println(scheduleCourses.get(0).getSchool_country());
        System.out.println(scheduleCourses.get(0).getSchool_name());
        System.out.println(scheduleCourses.get(0).getAvailable_semester());
        System.out.println(scheduleCourses.get(0).getDepartment());
        System.out.println(scheduleCourses.get(0).getErasmus_application_point());
    return scheduleCourses;
    }
}