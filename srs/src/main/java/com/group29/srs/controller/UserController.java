package com.group29.srs.controller;

import com.group29.srs.model.MyUser;
import com.group29.srs.model.StudentRegister;
import com.group29.srs.services.SecurityService;
import com.group29.srs.services.StudentServices;
import com.group29.srs.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UserController {
    @Autowired
    SecurityService securityService;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
//
    @Autowired
    UserServices userServices;

    @Autowired
    StudentServices studentServices;

    @PostMapping("login/")
    public String postLogin(@ModelAttribute(value = "user") MyUser myUser, BindingResult errors, Model model){
        securityService.autoLogin(String.valueOf(myUser.getUser_id()), myUser.getPassword());
        String userID = securityService.findLoggedInUsername();
        if (userID != null){
            MyUser user = userServices.getUserByID(myUser.getUser_id());
            if (user.getRole().getRole().equals("student"))
                return "redirect:/student/"+ userID;
            if (user.getRole().getRole().equals("instructor"))
                return "redirect:/instructor/"+ userID;
                return "redirect:/ta/"+ userID;
        }
        else{
            model.addAttribute("problem", true);
            model.addAttribute("message", "You entered wrong credentials. Try again.");
            return "login";

        }

    }

    @GetMapping("login/")
    public String getLogin(@ModelAttribute(value = "user") MyUser myUser, BindingResult errors, Model model)
    {
        String userID = securityService.findLoggedInUsername();
        if (userID != null){
            MyUser user = userServices.getUserByID(Long.valueOf(userID));
            if (user.getRole().getRole().equals("student"))
                return "redirect:/student/"+ userID;
            if (user.getRole().getRole().equals("instructor"))
                return "redirect:/instructor/"+ userID;
            return "redirect:/ta/"+ userID;
        }
        model.addAttribute("problem", false);
        model.addAttribute("message", "");
        return "login";
    }

    @GetMapping ("logout/")
    public String getLogout(@ModelAttribute(value = "user") MyUser myUser, BindingResult errors, Model model){
        securityService.logout();
        return "login";
    }


    @GetMapping
    public  String redirectToLogin( Model model){
        return "redirect:/login/";
    }

    @GetMapping("register-student/")
    public String getRegisterStudent(@ModelAttribute(value = "student") StudentRegister studentRegister, Model model) {

        return "sign-up";
    }

    @PostMapping("register-student/")
    public String registerStudent(@ModelAttribute(value = "student") StudentRegister studentRegister, Model model){
        int result = studentServices.insertStudent(studentRegister);
        System.out.println(result);
        if(result != 0)
            return "redirect:/login/";

        return "sign-up";
    }
}
