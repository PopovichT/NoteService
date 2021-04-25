package com.popovich.training.controller;

import com.popovich.training.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    private final Service service;

    @Autowired
    public Controller(Service service) {
        this.service = service;
    }

    // localhost/api/add?name=MyNote&text=FirstText
    @PostMapping("/add")
    public String createNote(@RequestParam String name, @RequestParam String text) {
        service.createNote(name, text);
        return "Note created successfully";
    }

}
