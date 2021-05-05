package com.popovich.training.repository;

import com.popovich.training.entity.Note;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface NoteRepository extends CrudRepository<Note, Long> {
    Optional<Note> findByName(String name);
}
