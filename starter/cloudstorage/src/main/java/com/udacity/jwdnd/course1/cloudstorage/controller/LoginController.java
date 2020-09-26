package com.udacity.jwdnd.course1.cloudstorage.controller;

import com.udacity.jwdnd.course1.cloudstorage.model.Users;
import com.udacity.jwdnd.course1.cloudstorage.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
//@RequestMapping("/login")
public class LoginController {

      private final UserService userService;
     public LoginController(UserService userService) {
        this.userService = userService;
    }

     @GetMapping("/login")
     public String loginView() {
         System.out.println("loginview");
         System.out.println("param");
         return "login";
     }

    @PostMapping("/login")
    public String postView(@ModelAttribute Users user, Model model)   {
        if (!userService.isUsernameAvailable(user.getUsername()) && userService.checkUsernamePassword(user.getUsername(),user.getPassword()))
            return "home";
        return "redirect:login?error";
    }
}
