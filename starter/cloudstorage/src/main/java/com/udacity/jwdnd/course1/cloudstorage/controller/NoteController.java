package com.udacity.jwdnd.course1.cloudstorage.controller;

import com.udacity.jwdnd.course1.cloudstorage.model.Users;
import com.udacity.jwdnd.course1.cloudstorage.service.NoteService;
import com.udacity.jwdnd.course1.cloudstorage.service.UserService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String postView(HttpSession session, @RequestParam("noteId") Integer noteId, @RequestParam("noteTitle") String noteTitle, @RequestParam("noteDescription") String noteDescription, Model model)   {
        String usernameSession = (String) session.getAttribute("SESSION_USERNAME");
        System.out.println("usernamesession:" + usernameSession);
        Users userDb = userService.getUser(usernameSession);
        System.out.println("NOTE ID:" + noteId);
        System.out.println("NOTE TITLE:" + noteTitle);
        System.out.println("NOTE DESCRIPTION:" + noteDescription);
        System.out.println("user id:" + userDb.getUserId());
        if(noteId == 0){
            noteService.uploadNote(noteTitle, noteDescription, userDb.getUserId());
        } else{
            noteService.updateNote(noteTitle, noteDescription, noteId);
        }
        model.addAttribute("notes", this.noteService.getNotes(userDb.getUserId()));
        return "home";
    }
    @GetMapping("/delete-note/{noteId}")
    public String deleteNote(HttpSession session, @PathVariable(value = "noteId") Integer noteId, Model model) {
        this.noteService.deleteNote(noteId);
        String usernameSession = (String) session.getAttribute("SESSION_USERNAME");
        Users userDb = userService.getUser(usernameSession);
        model.addAttribute("notes", this.noteService.getNotes(userDb.getUserId()));
        return "home";
    }
}