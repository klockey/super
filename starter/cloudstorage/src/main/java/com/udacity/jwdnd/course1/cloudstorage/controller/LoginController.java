package com.udacity.jwdnd.course1.cloudstorage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {

//    @GetMapping()
//    public String loginView() {
//        System.out.println("loginview");
//        return "login";

    @RequestMapping("/")
    public String redirect() {
        return "redirect:/login?param=error";
    }

    @PostMapping()
    public String postView()   {
        System.out.println("post");
        return "home";
    }
}
