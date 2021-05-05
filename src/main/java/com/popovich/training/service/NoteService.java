package com.popovich.training.service;

import com.popovich.training.entity.Note;
import com.popovich.training.entity.NoteComment;
import com.popovich.training.repository.NoteCommentRepository;
import com.popovich.training.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoteService {

    private NoteRepository repository;
    private NoteCommentRepository commentRepository;

    @Autowired
    public NoteService(NoteRepository repository, NoteCommentRepository noteCommentRepository) {
        this.repository = repository;
        this.commentRepository = noteCommentRepository;
    }

    public void createNote(String name, String text) {
        var note = new Note(name, text);
        repository.save(note);
    }

    public void createNoteComment(String name, String text, String noteName) {
        var noteOptional = repository.findByName(noteName);
        if (noteOptional.isEmpty()) {
            throw new RuntimeException();
        }
        var note = noteOptional.get();
        var noteComment = new NoteComment(name, text, note);
        commentRepository.save(noteComment);
    }
}
