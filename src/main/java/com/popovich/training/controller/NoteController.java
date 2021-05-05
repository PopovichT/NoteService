package com.popovich.training.controller;

import com.popovich.training.entity.dto.RequestCommentDto;
import com.popovich.training.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class NoteController {

    private final NoteService service;

    @Autowired
    public NoteController(NoteService service) {
        this.service = service;
    }

    @PostMapping("note/add")
    public String createNote(@RequestParam String name, @RequestParam String text) { //TODO: create DTO and change to @RequestBody
        service.createNote(name, text);
        return "Note created successfully";
    }

    @PostMapping("comment/add")
    public String createNoteComment(@RequestBody RequestCommentDto requestCommentDto) {
        service.createNoteComment(requestCommentDto.getName(), requestCommentDto.getText(), requestCommentDto.getNoteName());
        return "Comment has been created successfully";
    }

}

