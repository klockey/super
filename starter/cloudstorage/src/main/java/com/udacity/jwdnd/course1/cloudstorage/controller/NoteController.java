package com.udacity.jwdnd.course1.cloudstorage.controller;

import com.udacity.jwdnd.course1.cloudstorage.model.Users;
import com.udacity.jwdnd.course1.cloudstorage.service.NoteService;
import com.udacity.jwdnd.course1.cloudstorage.service.UserService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
@Scope("session")
public class NoteController {

    private final NoteService noteService;
    private final UserService userService;

    public NoteController (NoteService noteService, UserService userService) {
        System.out.println("noteservice");

        this.noteService = noteService;
        this.userService = userService;
    }

    @PostMapping("/noteModal")
    public String postView(HttpSession session)   {

          Users user = (Users) session.getAttribute("SESSION_USER");
          System.out.println("user id " + user.getUserId());
//        System.out.println("username " + user.getUsername());
//        System.out.println("username " + user.getPassword());
//        System.out.println("username " + user.getFirstName());
//        System.out.println("username " + user.getLastName());
//        int userId = userService.getUser(user.getUsername()).getUserId();
//        note.setUserId(userId);
//        noteService.uploadNote(note);
        return "home";
    }
}
