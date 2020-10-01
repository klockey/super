package com.udacity.jwdnd.course1.cloudstorage.controller;

import com.udacity.jwdnd.course1.cloudstorage.service.CredentialService;
import com.udacity.jwdnd.course1.cloudstorage.service.UserService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;


@Controller
@Scope("session")
public class CredentialController {

    private final CredentialService credentialService;
    private final UserService userService;


    public CredentialController(CredentialService credentialService, UserService userService) {
        System.out.println("credentialservice");
        this.credentialService = credentialService;
        this.userService = userService;
    }

    @PostMapping("/noteModal")
    @RequestMapping (name="credential")
       public String postView (HttpSession session, @RequestParam("url") String url, @RequestParam("username") String
        username, @RequestParam("password") String password, @RequestParam("userId") String userId, Model model){
            String usernameSession = (String) session.getAttribute("SESSION_USERNAME");
            System.out.println(usernameSession);
            return "";
        }
}
//    public String postView(HttpSession session, @RequestParam("noteId") Integer noteId, @RequestParam("noteTitle") String noteTitle,
//                           @RequestParam("noteDescription") String noteDescription, Model model)   {
//