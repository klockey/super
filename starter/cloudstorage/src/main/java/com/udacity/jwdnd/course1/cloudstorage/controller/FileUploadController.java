package com.udacity.jwdnd.course1.cloudstorage.controller;

import com.udacity.jwdnd.course1.cloudstorage.service.FileService;
import org.springframework.stereotype.Controller;

@Controller
//@RequestMapping("/home")
public class FileUploadController {

    private final FileService fileService;
    public FileUploadController(FileService fileService) {
        this.fileService = fileService;
    }

//    @PostMapping
//    public String uploader(@ModelAttribute Files file, Model model) {
//        fileService.uploadFile(file);
//       // redirectAttributes.addFlashAttribute("message", "You successfully uploaded " + file.getOriginalFilename() + "!");
//        System.out.println("upload");
//        return "home";
//    }
}
