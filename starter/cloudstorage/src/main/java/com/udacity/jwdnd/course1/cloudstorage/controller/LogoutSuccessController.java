package com.udacity.jwdnd.course1.cloudstorage.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/logout-success")
public class LogoutSuccessController {

    @PostMapping()
    public String loginView() {
        System.out.println("logout");
        return "logout-success";
    }
}

