package com.udacity.jwdnd.course1.cloudstorage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@Scope("session")
@RequestMapping("/login")
public class LoginController {
 //   private final UserService userService;
  //  private final NoteService noteService;
  //  public LoginController(UserService userService, NoteService noteService) {
     //   this.userService = userService;
    //    this.noteService = noteService;
 //   }
    @GetMapping()
    public String loginView() {
        System.out.println("loginview");
        System.out.println("param");
        return "login";
    }

//    @PostMapping()
//    public String postView(@ModelAttribute Users user, Model model, HttpServletRequest request)   {
//        System.out.println("login");
//        if (!userService.isUsernameAvailable(user.getUsername()) && userService.checkUsernamePassword(user.getUsername(),user.getPassword())) {
//            System.out.println("login controller username " + user.getUsername());
//            request.getSession().setAttribute("SESSION_USERNAME", user.getUsername());
//            Users userDb = userService.getUser(user.getUsername());
//            model.addAttribute("notes", this.noteService.getNotes(userDb.getUserId()));
//            System.out.println("post view");
//            return "home";
//        }
//        return "redirect:login?error";
//    }
}

