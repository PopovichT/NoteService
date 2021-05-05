package com.popovich.training.repository;

import com.popovich.training.entity.Note;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;


import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

//TODO(optional): test controller
@DataJpaTest
public class NoteRepositoryTest {

    @Autowired
    NoteRepository repository;

    @Test
    void canRepositorySaveAndFindNote() { //TODO: write test for another repository
        var note = new Note("FirstNote", "MyFirstNote");
        repository.save(note);

        Optional<Note> optionalNote = repository.findByName("FirstNote");
        assertTrue(optionalNote.isPresent());
        assertEquals(optionalNote.get().getName(), "FirstNote");
    }

}
