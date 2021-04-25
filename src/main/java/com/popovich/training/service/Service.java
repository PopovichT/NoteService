package com.popovich.training.service;

import com.popovich.training.entity.Note;
import com.popovich.training.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {

    private NoteRepository repository;

    @Autowired
    public Service(NoteRepository repository) {
        this.repository = repository;
    }

    public Note createNote(String name, String text) {
        var note = new Note(name, text);
        repository.save(note);
        return note;
    }
}
