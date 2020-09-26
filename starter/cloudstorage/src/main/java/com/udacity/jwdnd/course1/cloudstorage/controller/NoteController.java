package com.udacity.jwdnd.course1.cloudstorage.controller;

import com.udacity.jwdnd.course1.cloudstorage.model.Notes;
import com.udacity.jwdnd.course1.cloudstorage.service.NoteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class NoteController {

    private final NoteService noteService;

    public NoteController (NoteService noteService) {
        System.out.println("noteservice");

        this.noteService = noteService;
    }

    @PostMapping("noteModal")
    public String postView(@ModelAttribute Notes note, Model model)   {
        System.out.println("notemodal");
        noteService.uploadNote(note);
        return "home";
    }
}
