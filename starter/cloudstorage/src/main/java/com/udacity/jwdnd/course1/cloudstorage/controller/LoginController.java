package com.udacity.jwdnd.course1.cloudstorage.controller;

import com.udacity.jwdnd.course1.cloudstorage.model.Users;
import com.udacity.jwdnd.course1.cloudstorage.service.UserService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@Scope("session")
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
    public String postView(@ModelAttribute Users user, Model model, HttpServletRequest request)   {
         System.out.println("login");

        if (!userService.isUsernameAvailable(user.getUsername()) && userService.checkUsernamePassword(user.getUsername(),user.getPassword())) {
            request.getSession().setAttribute("SESSION_USER", user);

            user = (Users) request.getSession().getAttribute("SESSION_USER");

            System.out.println("username " + user.getUsername());
            System.out.println("login  if ");
            return "home";
        }
        return "redirect:login?error";
    }
}
