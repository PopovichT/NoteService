package com.popovich.training.repository;

import com.popovich.training.entity.NoteComment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteCommentRepository extends CrudRepository<NoteComment, Long> {
}
