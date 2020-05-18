package com.group29.srs.controller;

import com.group29.srs.model.MyUser;
import com.group29.srs.services.SecurityService;
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

    @Autowired
    UserServices userServices;

    @PostMapping("login/")
    public String postLogin(@ModelAttribute(value = "user") MyUser myUser, BindingResult errors, Model model){
        securityService.autoLogin(String.valueOf(myUser.getUser_id()), myUser.getPassword());
        String userID = securityService.findLoggedInUsername();

        if (userID != null){
            return "redirect:/student/"+ userID;
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
            return "redirect:/student/"+ userID;
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
}
